package tn.esprit.springproject.Services;

import ch.qos.logback.core.util.FixedDelay;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.CoursRepository;
import tn.esprit.springproject.Repository.InscriptionRepository;
import tn.esprit.springproject.Repository.PisteRepository;
import tn.esprit.springproject.Repository.SkieurRepository;
import tn.esprit.springproject.entities.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class SkieurServiceImplementation implements ISkieur {

    SkieurRepository skieurRepository;
    PisteRepository pisteRepository;
    CoursRepository coursRepository;
    InscriptionRepository inscriptionRepository;

    @Override
    public Skieur addSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public Skieur updateSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    // ken l9a skieur bel ID en paramétre yraja3houlek sinn Optional (yraja3lek null wala exception ki famesh)
    @Override
    public Skieur retrieveSkieurById(Long id) {
        return skieurRepository.findById(id).orElse(null);
    }


    @Override
    public List<Skieur> retrieveAllSkieur() {
        // test de la méthode d'affichage Log4j
        List<Skieur> skieurs = (List<Skieur>) skieurRepository.findAll();
        for (Skieur sk : skieurs) {
            log.info(" skieur : " + sk);
        }
        return skieurs;
    }


    @Override
    public void deleteSkieur(Long id) {
        skieurRepository.deleteById(id);
    }

    // Implémentation de la méthode de recherche par nom et Prenom
    @Override
    public Skieur findByNomEtPrenom(String a, String b) {
        return  skieurRepository.findByNomSAndPrenomS(a,b);
    }

    @Override
    public List<Skieur> findByPistes(Integer a) {
        return skieurRepository.findByPistesIdPiste(a);
    }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, int idPiste) {
        Skieur sk = skieurRepository.findById(numSkieur).orElse(null);
        Piste piste = pisteRepository.findById(idPiste).orElse(null);
        sk.getPistes().add(piste);  // hedhi equivalent to sk.Set() ama set temshi object we7ed barka // . get() temshi ala list kemla
        return skieurRepository.save(sk);
    }

    // Using Keywords

    @Override
    public List<Skieur> findAbonnementPrixAbon(float prix) {

        // return skieurRepository.findByAbonnementPrixAbon(prix);   // Using keywords

        // return skieurRepository.retrieveByPrixAbonnement(prix);   // Using SQL statements

        return skieurRepository.retrieveByPrix(prix); // Using JPQL
    }

    @Override
    public Skieur AddAndAsignToCours(Skieur sk, long numCours) {
        Skieur SavedSkieur = skieurRepository.save(sk);
        Cours cours = coursRepository.findById(numCours).orElse(null);
        Set<Inscription> listSkiInscri = SavedSkieur.getInscription();
        for (Inscription inscription : listSkiInscri ) {
        inscription.setSkieur(SavedSkieur);
        inscription.setCours(cours);
        inscriptionRepository.save(inscription);
        }

    return SavedSkieur;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.retrieveSkiersBySubscriptionType(typeAbonnement);
    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        return null;
    }

  /*  public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {


        Cours course = coursRepository.getReferenceById(numCours);
        if(course.getTypeCours() == TypeCours.COLLECTIF_ENFANT || course.getTypeCours() == TypeCours.COLLECTIF_ADULTE) {
            List<Inscription> inscriptions = inscriptionRepository.findAll();
            if (inscriptions.size() >= 6) {
                throw new IllegalStateException("Le nombre maximum de skieurs pour ce cours est atteint");
            }
        }
        Skieur skieur = skieurRepository.getReferenceById(numSkieur);
        inscription.setSkieur();
        return  inscriptionRepository.save(inscription);

    }*/



    @Scheduled(fixedRate = 30000)
    public void fixedratedelay(){
        System.out.println("fixed rate method");
    }
    @Scheduled(fixedDelay = 30000 )
    public void fixedDelayMethod(){
        System.out.println("fixed delay method");
    }
    @Scheduled(cron = "0 49 9 25 4 *")
    public void cronMethod(){
        System.out.println("Cron Method");
    }


}

