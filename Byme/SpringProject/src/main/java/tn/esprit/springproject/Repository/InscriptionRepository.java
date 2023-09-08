package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;

import java.util.List;

public interface InscriptionRepository  extends JpaRepository <Inscription, Long> {
    @Query("SELECT  inscri.numInscription from Inscription inscri JOIN Moniteur moniteur on inscri.cours member moniteur.cours where moniteur.numMoniteur = :idMon and inscri.cours.support = :support")
    List<Integer> numWeeksCourseOfInstructorBySupport(@Param("idMon") Long numMoniteur, @Param("support") Support support);

}
