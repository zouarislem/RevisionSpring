package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {


    List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement);

    List<Abonnement> findByDateFinBetween(LocalDate d1, LocalDate d2);

    @Query("SELECT count(*) from Abonnement a group by a.numAbon")
    Abonnement total();




}
