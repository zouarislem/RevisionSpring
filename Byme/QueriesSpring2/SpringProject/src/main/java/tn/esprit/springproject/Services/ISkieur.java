package tn.esprit.springproject.Services;

import tn.esprit.springproject.entities.Skieur;

import java.util.List;

public interface ISkieur {
    Skieur addSkieur(Skieur sk);
    Skieur updateSkieur(Skieur sk);
    Skieur retrieveSkieurById(Long id);
    List<Skieur> retrieveAllSkieur();
    void deleteSkieur(Long id);
    public Skieur findByNomEtPrenom(String a, String b);
    public List<Skieur> findByPistes(Integer a);
    Skieur assignSkieurToPiste(Long numSkieur, int idPiste);
    public List<Skieur> findAbonnementPrixAbon(float prix);
 }
