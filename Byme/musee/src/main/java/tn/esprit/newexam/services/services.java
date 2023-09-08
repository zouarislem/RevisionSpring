package tn.esprit.newexam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.newexam.entities.*;
import tn.esprit.newexam.repos.MuseeRepo;
import tn.esprit.newexam.repos.OeuvreRepo;
import tn.esprit.newexam.repos.PersoRepo;
import tn.esprit.newexam.repos.ZoneRepo;

@Service
public class services implements IServices {
@Autowired
    MuseeRepo museeRepo;
ZoneRepo zoneRepo;
OeuvreRepo oeuvreRepo;
PersoRepo persoRepo;
    @Override
    public Musee ajouterMusee(Musee musee) {
        return museeRepo.save(musee);
    }

    @Override
    public Zone ajouterZoneEtAffecterAMusee(Zone zone, Long idMusee) {
        Musee musee = museeRepo.findById(idMusee).orElse(null);
        zone.setMusee(musee);
        return zoneRepo.save(zone);
    }

    @Override
    public OeuvreArt ajouterOeuvreArtEtAffecterAZone(OeuvreArt oeuvreArt, Long idZone) {
       Zone z = zoneRepo.findById(idZone).orElse(null);
       oeuvreArt.setZone(z);

        return oeuvreRepo.save(oeuvreArt);
    }

    @Override
    public void affecterPersonnelsAZone(Long idZone, Long idGardien, Long idDirecteur) {
        Zone z = zoneRepo.findById(idZone).orElse(null);
        Personnel gar = persoRepo.findById(idGardien).orElse(null);
       Personnel direc = persoRepo.findById(idDirecteur).orElse(null);
       z.setDirecteur(direc);
       gar.setZone(z);
       zoneRepo.save(z);
    }

 /*   @Override
    public List<String> titreTableauParMuseeEtDirection(Long idMusee, Direction direction) {
      List<String> titres = new ArrayList<>();
      for ( OeuvreArt art : oeuvreRepo.findByZoneMuseeidMuseeAndZoneDiretion(idMusee, direction)){
          titres.add(art.getTitreTableau());
      }


        return titres;
    }*/
}
