package tn.esprit.springproject.services;

import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;

import java.util.List;

public interface IInscription {

    Inscription addInscriptionAndAssignToSkieur(Inscription inscription, Long numSkieur);

    Inscription addInscriptionAndAssignToCours(Long numInscription, Long numCours);

    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);

    List<Integer> numWeeksCourseOfInstructorBySupport(@Param("idMon") Long numMoniteur, @Param("support") Support support);
}
