package tn.esprit.spring.testspring.service;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.spring.testspring.entities.*;
import tn.esprit.spring.testspring.repository.MuseeRepository;
import tn.esprit.spring.testspring.repository.OeuvreArtRepository;
import tn.esprit.spring.testspring.repository.PersonnelRepository;
import tn.esprit.spring.testspring.repository.ZoneRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceImpl implements IService {
    private MuseeRepository museeRepository;
    private ZoneRepository zoneRepository;
    private OeuvreArtRepository oeuvreArtRepository;
    private PersonnelRepository personnelRepository;
    @Override
    public Musee ajouterMusee(Musee musee) {
        return museeRepository.save(musee);
    }

    @Override
    public Zone ajouterZoneEtAffecterAMusee(Zone zone, Long idMusee) {
        Musee musee = museeRepository.findById(idMusee).orElse(null);
        zone.setMusee(musee);
        return zoneRepository.save(zone);
    }

    @Override
    public OeuvreArt ajouterOeuvreArtEtAffecterAZone(OeuvreArt oeuvreArt, Long idZone) {
        Zone zone = zoneRepository.findById(idZone).orElse(null);
        oeuvreArt.setZone(zone);
        return oeuvreArtRepository.save(oeuvreArt);
    }

    @Override
    public void affecterPersonnelsAZone(Long idZone, Long idGardien, Long idDirecteur) {
        Personnel gardien = personnelRepository.findById(idGardien).orElse(null);
        Personnel directeur = personnelRepository.findById(idDirecteur).orElse(null);
        Zone zone = zoneRepository.findById(idZone).orElse(null);
        zone.setDirecteur(directeur);
        gardien.setZone(zone);
        zoneRepository.save(zone);
    }

    @Override
    public List<String> titreTableauParMuseeEtDirection(Long idMusee, Direction direction) {
    List<String> titres = new ArrayList<>();
    for (OeuvreArt art : oeuvreArtRepository.findByZoneMuseeMuseeIdAndZoneDirection(idMusee, direction)){
        titres.add(art.getTitreTableau());
    }
        return titres;
    }

    @Override
    @Scheduled(cron = "*/60 * * * * *" )
    public void desaffecterDirecteursZoneInactif() {
    for (Zone zone: zoneRepository.findAll()){
        if (!zone.isActif()){
            zone.setDirecteur(null);
            zoneRepository.save(zone);
        }
    }
    }
}
