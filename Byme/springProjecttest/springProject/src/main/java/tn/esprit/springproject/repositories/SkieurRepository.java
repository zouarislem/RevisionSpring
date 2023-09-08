package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Skieur;

public interface SkieurRepository extends JpaRepository<Skieur,Long>{
    Skieur findByAbonnement(Abonnement abonnement);
}
