package tn.spring.examenclassroom.services;

import lombok.AllArgsConstructor;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.spring.examenclassroom.entities.Classe;
import tn.spring.examenclassroom.entities.CoursClassroom;
import tn.spring.examenclassroom.entities.Niveau;
import tn.spring.examenclassroom.entities.Utilisateur;
import tn.spring.examenclassroom.repositories.ClasseRepo;
import tn.spring.examenclassroom.repositories.CoursClassroomRepo;
import tn.spring.examenclassroom.repositories.UtilisateurRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class Services implements IServices {
UtilisateurRepo utilisateurRepo;
ClasseRepo classeRepo;
CoursClassroomRepo coursClassroomRepo;

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepo.save(c);
    }

    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer idClasse) {
       Classe classe = classeRepo.findById(idClasse).orElse(null);
       cc.setClasse(classe);

        return coursClassroomRepo.save(cc);
    }

    @Override
    public void affecterUtilisateurClasse(int idUtilisateur, int idClasse) {
        Utilisateur user = utilisateurRepo.findById(idUtilisateur).orElse(null);
        Classe classe = classeRepo.findById(idClasse).orElse(null);
        user.setClasse(classe);
        utilisateurRepo.save(user);


    }

    @Override
    public int nbUtilisateurParNiveau(Niveau nv) {
        return utilisateurRepo.nbUtilisateurParNiveau(nv);
    }

    @Override
    public void desaffecterCoursClassroomClasse(int idCours) {
        CoursClassroom coursClassroom = coursClassroomRepo.findById(idCours).orElse(null);
        coursClassroom.setClasse(null);
        coursClassroomRepo.save(coursClassroom);
    }

@Scheduled(fixedRate = 60000)
    @Override
    public void archiverCoursClassrooms() {
       List<CoursClassroom> coursClassrooms= coursClassroomRepo.findAll();
        for (CoursClassroom coursClassroom : coursClassrooms){
            coursClassroom.setArchive(true);
            coursClassroomRepo.save(coursClassroom);
        }
    }


}
