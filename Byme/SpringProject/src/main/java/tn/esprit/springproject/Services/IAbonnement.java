package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IAbonnement {

    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    Abonnement retrieveAbonnementById(Long id);
    List<Abonnement> retrieveAllAbonnement();
    void deleteAbonnement(Long id);
    Set<Abonnement> findByTypeAbon(TypeAbonnement type);
    List<Abonnement> findByDateDebutBetween(Date startDate, Date endDate);

}

