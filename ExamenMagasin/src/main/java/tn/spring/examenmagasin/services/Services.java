package tn.spring.examenmagasin.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.spring.examenmagasin.entities.*;
import tn.spring.examenmagasin.repositories.EmployeRepo;
import tn.spring.examenmagasin.repositories.EntrepriseRepo;
import tn.spring.examenmagasin.repositories.MagasinRepo;
import tn.spring.examenmagasin.repositories.RayonReposi;

import java.util.List;

@Service
@AllArgsConstructor
public class Services implements IServices{

    EmployeRepo employeRepo;
    RayonReposi rayonReposi;
    MagasinRepo magasinRepo;
    EntrepriseRepo entrepriseRepo;
    @Override
    public Employe ajouterEmplyer(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public Rayon ajouterRayon(Rayon rayon) {
        return rayonReposi.save(rayon);
    }

    @Override
    public Entreprise ajouterEntrepriseEtMagasinAssocies(Entreprise entreprise) {
        List<Magasin> magasins = entreprise.getMagasins();
        for (Magasin magasin: magasins
             ) {
            magasin.setEntreprise(entreprise);
        }

        return entrepriseRepo.save(entreprise);
    }

    @Override
    public Employe affecterEmployeARayon(Long identifiant, String codeRayon) {
       Rayon rayon = rayonReposi.findbycoderayon(codeRayon);
       Employe employe = employeRepo.findByIdentifiant(identifiant);
        employe.getRayons().add(rayon);
        return employeRepo.save(employe);
    }

    @Override
    public Employe affecterEmployeAMagasin(Long identifiant, Long idMagasin) {
        Employe employe = employeRepo.findByIdentifiant(identifiant);
        Magasin magasin = magasinRepo.findById(idMagasin).orElse(null);
        if (
                employe.getCategorie().equals(Categorie.ORDINAIRE)
        ) {
            employe.setMagasin1(magasin);
        }
        else {
            employe.setChefrayon(magasin);
        }
        return employeRepo.save(employe);

    }


}
