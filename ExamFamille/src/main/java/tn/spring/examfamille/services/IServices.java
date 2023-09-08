package tn.spring.examfamille.services;

import tn.spring.examfamille.entities.FamilleActe;
import tn.spring.examfamille.entities.Pathologie;
import tn.spring.examfamille.entities.Patient;

public interface IServices {
    public void affecterActeAPathologie(String codeActe , String codePathologie);
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte);
    public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath);
    public Pathologie ajouterPathologie(Pathologie path);
}
