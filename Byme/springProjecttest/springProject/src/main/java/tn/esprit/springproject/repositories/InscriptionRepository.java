package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;

import java.util.List;


public interface InscriptionRepository extends JpaRepository<Inscription,Long> {

    @Query("SELECT  ins.numInscription from Inscription ins JOIN Moniteur mon on ins.cours member mon.cours where mon.numMoniteur = :idMon and ins.cours.support = :support")
    List<Integer> numWeeksCourseOfInstructorBySupport(@Param("idMon") Long numMoniteur,@Param("support") Support support);


}
