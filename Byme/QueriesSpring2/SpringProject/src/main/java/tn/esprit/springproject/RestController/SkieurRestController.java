package tn.esprit.springproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.ISkieur;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;

@RestController
public class SkieurRestController {

    // @Autowired taamalek créaation mtaa instance tak tak
    @Autowired
    ISkieur iSkieur;
    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur sk){
        return iSkieur.addSkieur(sk);
    }
    @PutMapping("/updateSkieur")
    public Skieur updateSkieur(@RequestBody Skieur sk){
    return iSkieur.updateSkieur(sk);
    }

    @GetMapping("/getSkieurById/{id}")

    // @Pathvariable ki t7eb taati ID fel route
    public Skieur retrieveSKById(@PathVariable("id") Long id){
        return iSkieur.retrieveSkieurById(id);
    }

    @GetMapping("/getAllSkieurs")
    public List<Skieur> retrieveAllSkieurs(){
        return iSkieur.retrieveAllSkieur();
    }

    @DeleteMapping("/delSkieur/{id}")
    public void deleteSkieur(@PathVariable("id") Long id){
         iSkieur.deleteSkieur(id);
    }


    @GetMapping("/findSkieurByNomAndPrenom/{nom}/{prenom}")
    public Skieur findSkieurByNomEtPrenom(@PathVariable("nom") String a, @PathVariable("prenom") String b)
    {
        return iSkieur.findByNomEtPrenom(a,b);
    }
    @GetMapping("/findByPistes/{i}")
    public List<Skieur> findByPistes(@PathVariable("i") Integer i){
        return iSkieur.findByPistes(i);
    }

    @PostMapping("/assignSkieurToPiste/{numSkieur}/{idPiste}")
    public Skieur assignSkieurToPiste(@PathVariable("numSkieur") Long numSkieur, @PathVariable("idPiste") int idPiste)
    {
        return iSkieur.assignSkieurToPiste(numSkieur,idPiste);
    }

    @GetMapping("/findByAbonnementPrixAbon/{prix}")
    public List<Skieur> findByAbonnementPrixAbon(@PathVariable("prix") Float prix){
        return iSkieur.findAbonnementPrixAbon(prix);
    }
}
