package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Cours;

import java.util.List;

public interface ICours {

    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    Cours retrieveCoursById(Long id);
    List<Cours> retrieveAllCours();
    void deleteCours(Long id);

}
