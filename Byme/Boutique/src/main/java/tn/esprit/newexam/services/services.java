package tn.esprit.newexam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.newexam.entities.Boutique;
import tn.esprit.newexam.entities.CentreCommercial;
import tn.esprit.newexam.entities.Client;
import tn.esprit.newexam.repositories.BoutiqueRepo;
import tn.esprit.newexam.repositories.CentreRepos;
import tn.esprit.newexam.repositories.ClientsRepo;

import java.util.List;
import java.util.Set;

@Service
public class services implements iservice{

    @Autowired
    CentreRepos centreRepos;
    @Autowired
    BoutiqueRepo boutiqueRepo;
    @Autowired
    ClientsRepo clientsRepo;
    @Override
    public void ajouCentre(CentreCommercial centre) {
    Boutique boutique = ajouBoutique(centre);
    boutique.setCentreCommercial(centre);
    centreRepos.save(centre);
    }

    @Override
    public Boutique ajouBoutique(CentreCommercial centre) {
        Set<Boutique> boutiques=(Set<Boutique>) centre.getBoutiques();
        for (Boutique boutique : boutiques){
            return boutiqueRepo.save(boutique);
        }
        return null;
    }

    @Override
    public void ajouterEtaffecterListeboutique(List<Boutique> lb, Long idCentre) {
        boutiqueRepo.saveAll(lb);
        CentreCommercial centre = centreRepos.findById(idCentre).orElse(null);
        for (Boutique boutique : lb){
            boutique.setCentreCommercial(centre);
        }
        boutiqueRepo.saveAll(lb);
    }

   @Override
    public void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques) {
    /*   clientsRepo.save(client);
      List<Boutique> boutiques = boutiqueRepo.findAll();
      for (Boutique boutique : boutiques){
          for(Long id : idBoutiques){
              if (boutique.getId().equals(id)){

              }
          }

      }
    }*/}
}
