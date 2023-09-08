package tn.spring.examenclassroom.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.examenclassroom.entities.Classe;
import tn.spring.examenclassroom.entities.CoursClassroom;
import tn.spring.examenclassroom.entities.Niveau;
import tn.spring.examenclassroom.entities.Utilisateur;
import tn.spring.examenclassroom.services.IServices;

@RestController
@AllArgsConstructor
public class Controller {
IServices iServices;


@PostMapping("/addUtili")
    public Utilisateur ajouterUtilisateur (@RequestBody Utilisateur utilisateur){
        return iServices.ajouterUtilisateur(utilisateur);
    }


@PostMapping("/addClasse")
    public Classe ajouterClasse (@RequestBody Classe c){
    return iServices.ajouterClasse(c);
    }

@PostMapping("ajouterCoursClassroom/{idClasse}")
    public CoursClassroom ajouterCoursClassroom(@RequestBody CoursClassroom cc,@PathVariable("idClasse") Integer idClasse){
    return iServices.ajouterCoursClassroom(cc,idClasse);
    }

@PostMapping("/affecterUtilisateurClasse/{idUtilisateur}/{idClasse}")
    public void affecterUtilisateurClasse(@PathVariable("idUtilisateur") int idUtilisateur, @PathVariable("idClasse") int idClasse) {
         iServices.affecterUtilisateurClasse(idUtilisateur, idClasse);

}

@GetMapping("/nbrusers/{nv}")
    public int nbUtilisateurParNiveau(@PathVariable("nv") Niveau nv){
    return iServices.nbUtilisateurParNiveau(nv);
    }

@PostMapping("/desaffecter/{idCours}")
    public void desaffecterCoursClassroomClasse(@PathVariable("idCours") int idCours)
    {
         iServices.desaffecterCoursClassroomClasse(idCours);
    }
}
