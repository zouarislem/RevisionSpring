package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Abonnement;
import java.util.List;

public interface IAbonnement {

    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    Abonnement retrieveAbonnementById(Long id);
    List<Abonnement> retrieveAllAbonnement();
    void deleteAbonnement(Long id);
}

