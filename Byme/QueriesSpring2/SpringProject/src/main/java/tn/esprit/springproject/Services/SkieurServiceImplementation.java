package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.PisteRepository;
import tn.esprit.springproject.Repository.SkieurRepository;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class SkieurServiceImplementation implements ISkieur {

    SkieurRepository skieurRepository;
    PisteRepository pisteRepository;

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


}

