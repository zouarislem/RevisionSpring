package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;

public interface ISkieur {

    List<Skieur> retrieveAllSkieur();

    Skieur assignSkieurToPiste(Long numSkieur,Long numPiste);


}
