package tn.spring.examenmagasin.services;

import tn.spring.examenmagasin.entities.Employe;
import tn.spring.examenmagasin.entities.Entreprise;
import tn.spring.examenmagasin.entities.Rayon;

public interface IServices {

    public Employe ajouterEmplyer (Employe employe);
    public Rayon ajouterRayon(Rayon rayon);

    public Entreprise ajouterEntrepriseEtMagasinAssocies(Entreprise entreprise);
    public Employe affecterEmployeARayon(Long identifiant, String codeRayon);
    public Employe affecterEmployeAMagasin( Long identifiant, Long idMagasin);

}
