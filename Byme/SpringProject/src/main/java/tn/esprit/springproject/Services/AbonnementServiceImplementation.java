package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.AbonnementRepository;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
//@AllArgsConstructor // Injections par constructeur ( n3oudou nestaamloha f blasét @Autowired)
public class AbonnementServiceImplementation implements IAbonnement{

    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnementById(Long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public void deleteAbonnement(Long id) {
        abonnementRepository.deleteById(id);
    }

    @Override
    public Set<Abonnement> findByTypeAbon(TypeAbonnement type){
        return abonnementRepository.findByTypeAbon(type);
    }


    @Override
    public List<Abonnement> findByDateDebutBetween(Date startDate, Date endDate) {
        return abonnementRepository.findByDateDebutBetween(startDate, endDate);
    }

}
