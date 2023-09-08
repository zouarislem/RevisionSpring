package tn.esprit.springproject.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.CoursRepository;
import tn.esprit.springproject.Repository.InscriptionRepository;
import tn.esprit.springproject.Repository.SkieurRepository;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.entities.Support;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionServiceImplementation implements IInscription {

  //  @Autowired
    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository;
    CoursRepository coursRepository;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Inscription retrieveInscriptionById(Long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public void deleteInscription(Long id) {
        inscriptionRepository.deleteById(id);
    }

    @Override
    public Inscription addInscriptionAndAssignToSkieur(Inscription inscri, Long nomSkieur) {
        Skieur sk = skieurRepository.findById(nomSkieur).orElse(null);
        inscri.setSkieur(sk);
        return inscriptionRepository.save(inscri);
    }

    @Override
    public Inscription addInscriptionAndassignToCours(Inscription inscri, Long numCours) {
    Cours cours = coursRepository.findById(numCours).orElse(null);
    inscri.setCours(cours);
    return inscriptionRepository.save(inscri);
        }

        // object we7edt taamel . set directement , liste kemla tgeteha w baad taffecti

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElseThrow(() -> new EntityNotFoundException("Le skieur avec l'identifiant " + numSkieur + " n'existe pas"));
        Cours cours = coursRepository.findById(numCours)
                .orElseThrow(() -> new EntityNotFoundException("Le cours avec l'identifiant " + numCours + " n'existe pas"));
        inscription.setCours(cours);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);

    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numMoniteur, Support support) {
        return inscriptionRepository.numWeeksCourseOfInstructorBySupport(numMoniteur,support);
    }

}

