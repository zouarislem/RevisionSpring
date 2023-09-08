package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;
import tn.esprit.springproject.repositories.AbonnementRepository;

import java.util.List;

@Service
//@AllArgsConstructor
public class AbonnementService implements IAbonnement{

    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {

        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {

        return abonnementRepository.save(abonnement);
    }

    @Override
    public void deleteAbonnement(Long id) {

        abonnementRepository.deleteById(id);

    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {

        return abonnementRepository.save(abonnement);
    }

    @Override
    public List<Abonnement> findAbonnementByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement) {
        return abonnementRepository.findByTypeAbonnementOrderByDateDebut(typeAbonnement);
    }
}
