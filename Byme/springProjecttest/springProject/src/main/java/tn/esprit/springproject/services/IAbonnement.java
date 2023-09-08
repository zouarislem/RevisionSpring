package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.List;

public interface IAbonnement {
    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    void deleteAbonnement(Long id);
    Abonnement updateAbonnement(Abonnement abonnement);

    List<Abonnement> findAbonnementByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement);
}
