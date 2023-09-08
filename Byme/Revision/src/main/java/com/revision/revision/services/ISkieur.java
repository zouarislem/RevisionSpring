package com.revision.revision.services;

import com.revision.revision.entities.Skieur;

import java.util.List;

public interface ISkieur {
    Skieur addSkieur(Skieur sk);
    Skieur UpdateSkieur(Skieur sk);
    Skieur retrieveSkieurById(long id);
    List<Skieur> retrieveAllSkieur();
    void deleteSkieur(long id);

    List<Skieur> findSkieurByAbonnement(Float prix);
}
