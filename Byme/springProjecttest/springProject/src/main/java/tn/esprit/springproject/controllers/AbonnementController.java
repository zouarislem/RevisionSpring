package tn.esprit.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.services.AbonnementService;
import tn.esprit.springproject.services.IAbonnement;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class AbonnementController {

    @Autowired
    AbonnementService AbonnementS;


    @PostMapping("/addab")
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement)
    {
        return AbonnementS.addAbonnement(abonnement);
    }

    @PutMapping("/updateab")
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement)
    {
        return AbonnementS.updateAbonnement(abonnement);
    }

    @GetMapping("/affab")
    public List<Abonnement> retrieveAbonnement ()
    {
        return AbonnementS.retrieveAllAbonnement();
    }

    @DeleteMapping("deleteab/{id}")
    public void deleteAbonnement(@PathVariable("id") Long id)
    {
        AbonnementS.deleteAbonnement(id);
    }



}
