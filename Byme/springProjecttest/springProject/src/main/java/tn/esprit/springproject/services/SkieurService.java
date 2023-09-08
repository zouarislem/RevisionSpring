package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.repositories.PisteRepository;
import tn.esprit.springproject.repositories.SkieurRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class SkieurService implements ISkieur{


    SkieurRepository skieurRepository;

    PisteRepository pisteRepository;

    @Override
    public List<Skieur> retrieveAllSkieur() {

        return skieurRepository.findAll();
    }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {

        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null);
        Piste piste=pisteRepository.findById(numPiste).orElse(null);

        skieur.getPistes().add(piste);

        return skieurRepository.save(skieur);
    }


}
