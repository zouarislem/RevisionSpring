package tn.esprit.springproject.Services;


import tn.esprit.springproject.entities.Moniteur;

import java.util.List;

public interface IMoniteur {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    Moniteur retrieveMoniteurById(Long id);
    List<Moniteur> retrieveAllMoniteurs();
    void deleteMoniteur(Long id);
    Moniteur addMoniteurAndAssignToCours(Moniteur m , Long numCours);
}
