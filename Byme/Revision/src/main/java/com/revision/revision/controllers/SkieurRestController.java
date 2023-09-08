package com.revision.revision.controllers;

import com.revision.revision.entities.Skieur;
import com.revision.revision.services.ISkieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkieurRestController {

 @Autowired
 ISkieur iSkieur;
@PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur sk){
        return iSkieur.addSkieur(sk);
    }

    @PutMapping("/updateSkieur")
    public Skieur UpdateSkieur(@RequestBody Skieur sk){
    return iSkieur.UpdateSkieur(sk);
    }
    @GetMapping("/GetById/{id}")
    public Skieur retrieveSkieurById(@PathVariable long id){
    return iSkieur.retrieveSkieurById(id);
    }
    @GetMapping("/GetAllSkieur")
    public List<Skieur> retrieveAllSkieur(){
    return iSkieur.retrieveAllSkieur();
    }
    @DeleteMapping("/deleteSkieur/{id}")

    public void deleteSkieur(@PathVariable long id){
    iSkieur.deleteSkieur(id);
    }
@GetMapping("/findByPrixAbonn/{prix}")
    public List<Skieur> findByAbonnByPrix(@PathVariable("prix") Float prix)
    {
        return iSkieur.findSkieurByAbonnement(prix);
    }




}
