package tn.spring.examenclassroom.services;

import tn.spring.examenclassroom.entities.Classe;
import tn.spring.examenclassroom.entities.CoursClassroom;
import tn.spring.examenclassroom.entities.Niveau;
import tn.spring.examenclassroom.entities.Utilisateur;

public interface IServices {

    public Utilisateur ajouterUtilisateur (Utilisateur utilisateur);
    public Classe ajouterClasse (Classe c);
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer idClasse);
    public void affecterUtilisateurClasse (int idUtilisateur, int idClasse);
    public int nbUtilisateurParNiveau(Niveau nv);
    public void desaffecterCoursClassroomClasse(int idCours);

    public void archiverCoursClassrooms();
}
