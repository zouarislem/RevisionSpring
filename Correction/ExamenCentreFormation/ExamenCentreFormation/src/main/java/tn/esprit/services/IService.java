package tn.esprit.services;

import java.util.Date;

import tn.esprit.entities.Apprenant;
import tn.esprit.entities.Formateur;
import tn.esprit.entities.Formation;

public interface IService {

	public void ajouterFormation(Formation formation, Integer idFormateur);
	public void addApprenant(Apprenant apprenant);
	public void addFormateur(Formateur formateur);
	public void affecterApprenantFormation(Integer idFormation, Integer idApprenant);
	public float  getFormateurRemunerationByDate(Integer idFormateur, Date dateDebut, Date dateFin);
	public void getNbrApprenantByFormation ();
    public int getRevenuByFormation(Integer idFormation);
	
}
