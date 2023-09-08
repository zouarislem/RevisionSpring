package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.entities.Support;
import tn.esprit.springproject.repositories.CoursRepository;
import tn.esprit.springproject.repositories.InscriptionRepository;
import tn.esprit.springproject.repositories.SkieurRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class InscriptionService implements IInscription{

    @Autowired
    InscriptionRepository inscriptionRepository;
    SkieurRepository skieurRepository;
    CoursRepository coursRepository;
    @Override
    public Inscription addInscriptionAndAssignToSkieur(Inscription inscription, Long numSkieur) {
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepository.save(inscription);

    }

    @Override
    public Inscription addInscriptionAndAssignToCours(Long numInscription, Long numCours) {
        Cours cours=coursRepository.findById(numCours).orElse(null);
        Inscription inscription=inscriptionRepository.findById(numInscription).orElse(null);
        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }

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
