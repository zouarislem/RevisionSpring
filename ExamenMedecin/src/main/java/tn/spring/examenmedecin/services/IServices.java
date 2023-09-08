package tn.spring.examenmedecin.services;

import tn.spring.examenmedecin.entities.Clinique;
import tn.spring.examenmedecin.entities.Medecin;

public interface IServices {

    public Clinique addClinique (Clinique clinique);
    public Medecin addMedecinAndAssignToClinique (Medecin medecin, Long cliniqueId);
}
