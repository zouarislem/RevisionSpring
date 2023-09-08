package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.List;

public interface ISkieur {
    Skieur addSkieur(Skieur sk);
    Skieur updateSkieur(Skieur sk);
    Skieur retrieveSkieurById(Long id);
    List<Skieur> retrieveAllSkieur();
    void deleteSkieur(Long id);
    public Skieur findByNomEtPrenom(String a, String b);
    public List<Skieur> findByPistes(Integer a);
    Skieur assignSkieurToPiste(Long numSkieur, int idPiste);
    public List<Skieur> findAbonnementPrixAbon(float prix);

    public Skieur AddAndAsignToCours (Skieur sk, long numCours);
   public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

        public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);


}
