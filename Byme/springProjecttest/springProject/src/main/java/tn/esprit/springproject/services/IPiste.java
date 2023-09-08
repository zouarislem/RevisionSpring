package tn.esprit.springproject.services;

import tn.esprit.springproject.entities.Piste;

import java.util.List;

public interface IPiste {

    List<Piste> retrieveAllPiste();
    Piste addPiste(Piste piste);
    void deletePiste(Long id);
    Piste updatePiste(Piste piste);


}
