package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.services.ISkieur;
import tn.esprit.springproject.services.SkieurService;

import java.util.List;
@AllArgsConstructor
@RestController
public class SkieurController {

    SkieurService skieurService;
    ISkieur iSkieur;

    @GetMapping("/affsk")
    public List<Skieur> affSkieur(Skieur skieur){
        return iSkieur.retrieveAllSkieur();
    }

    @PostMapping("/affacterSP/{nums}/{nump}")
    public Skieur affectation(@PathVariable("nums") Long nums, @PathVariable("nump") Long nump){

        return iSkieur.assignSkieurToPiste(nums,nump);
    }

}
