package com.example.b.services;

import com.example.b.entities.Bibliotheque;
import com.example.b.entities.Livre;
import com.example.b.entities.Personnel;
import com.example.b.entities.Rayon;

import java.util.List;

public interface IExamenService {
     Bibliotheque ajouterBibliotheque(Bibliotheque bibliotheque);
     Rayon ajouterRayonEtAffecterABibliotheque(Rayon r, Long idBibliotheque);
    void ajouterLivreEtAffecterARayon(Livre l , Long idRayon);
    Personnel ajoutPersonnelEtAffecterARayon(Personnel p,String codeRayon);
    List<String> titreLivreParBibliothequeEtRayon(Long idBibliotheque,Long idRayon);
    void desaffecterPersonnelDuRayon(Long idPersonnel);
}
