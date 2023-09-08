package com.example.b.services;


import com.example.b.entities.*;
import com.example.b.repositories.BibliothequeRepository;
import com.example.b.repositories.LivreRepository;
import com.example.b.repositories.PersonnelRepository;
import com.example.b.repositories.RayonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ExamenServiceImpl implements IExamenService{

    private BibliothequeRepository bibliothequeRepository;
    private PersonnelRepository personnelRepository;
    private RayonRepository rayonRepository;
    private LivreRepository livreRepository;

    @Override
    public Bibliotheque ajouterBibliotheque(Bibliotheque bibliotheque) {
        return bibliothequeRepository.save(bibliotheque);
    }

    @Override
    public Rayon ajouterRayonEtAffecterABibliotheque(Rayon r,Long idBibliotheque) {
        Bibliotheque b= bibliothequeRepository.findById(idBibliotheque).get();
        r.setBibliotheque(b);
        rayonRepository.save(r);
        return r;
    }

    @Override
    public void ajouterLivreEtAffecterARayon(Livre l ,Long idRayon) {
        Rayon r = rayonRepository.findById(idRayon).get();
        l.setRayon(r);
        livreRepository.save(l);
    }

    @Override
    public Personnel ajoutPersonnelEtAffecterARayon(Personnel p, String codeRayon) {
        Rayon r = rayonRepository.findByCodeRayon(codeRayon);
        if (p.getTypePersonnel().equals(TypePersonnel.BIBLIOTHECAIRE))
        {
            p.setRayonBibliothecaire(r);
            personnelRepository.save(p);

        }
    else
        {
            p.setRayonResponsable(r);
            r.setResponsable(p);
            personnelRepository.save(p);
            rayonRepository.save(r);
        }
        return p;
    }

    @Override
    public List<String> titreLivreParBibliothequeEtRayon(Long idBibliotheque, Long idRayon) {
        List<String> titreLivres = new ArrayList<>();
        List<Livre> livres= livreRepository.findByRayonIdRayonAndRayonBibliothequeIdBibliotheque(idRayon,idBibliotheque);
       for (Livre livre:livres)
       {
           titreLivres.add(livre.getTitre());
       }
       return  titreLivres;
    }

    @Override
    public void desaffecterPersonnelDuRayon(Long idPersonnel) {
       Personnel p = personnelRepository.findById(idPersonnel).get();
       if(p.getTypePersonnel().equals(TypePersonnel.BIBLIOTHECAIRE)) {
           p.setRayonResponsable(null);
           p.setRayonBibliothecaire(null);
           personnelRepository.save(p);
       }
       else {
        Rayon r= p.getRayonResponsable();
        r.setResponsable(null);
        rayonRepository.save(r);
       }
    }
}
