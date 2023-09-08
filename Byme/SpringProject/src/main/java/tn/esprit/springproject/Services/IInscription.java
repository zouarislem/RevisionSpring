package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;

import java.util.List;

public interface IInscription {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscriptionById(Long id);
    List<Inscription> retrieveAllInscriptions();
    void deleteInscription(Long id);
    Inscription addInscriptionAndAssignToSkieur (Inscription inscri, Long nomSkieur);
    Inscription addInscriptionAndassignToCours (Inscription inscri, Long numCours);
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) ;
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numMoniteur, Support support);

}
