package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement, Long> {
    Set<Abonnement> findByTypeAbon(TypeAbonnement type);
    List<Abonnement> findByDateDebutBetween(Date startDate, Date endDate);

}
