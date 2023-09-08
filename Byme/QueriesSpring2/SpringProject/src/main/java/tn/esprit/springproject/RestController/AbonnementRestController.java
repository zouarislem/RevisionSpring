package tn.esprit.springproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.IAbonnement;
import tn.esprit.springproject.Services.ISkieur;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;

@RestController
// @AllArgsConstructor   :najmou nestaamloha f 3oudh autowired

public class AbonnementRestController {
    @Autowired
    IAbonnement iAbonnement;
    @PostMapping("/addAbonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement){
        return iAbonnement.addAbonnement(abonnement);
    }
    @PutMapping("/updateAbonnement") //@PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return iAbonnement.updateAbonnement(abonnement);
    }

    @GetMapping("/getAbonnementById/{id}")
    public Abonnement retrieveAbonnementById(@PathVariable("id") Long id){
        return iAbonnement.retrieveAbonnementById(id);
    }

    @GetMapping("/getAllAbonnements")
    public List<Abonnement> retrieveAllAbonnements(){
        return iAbonnement.retrieveAllAbonnement();
    }

    @DeleteMapping("/delAbonnement/{id}")
    public void deleteAbonnement(@PathVariable("id") Long id){
        iAbonnement.deleteAbonnement(id);
    }



}
