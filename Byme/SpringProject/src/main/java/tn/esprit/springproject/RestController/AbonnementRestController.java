package tn.esprit.springproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.IAbonnement;
import tn.esprit.springproject.Services.ISkieur;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;
import java.util.Set;

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

    @GetMapping("/findByTypeAbon/{type}")

        public Set<Abonnement> findByTypeAbon(@PathVariable("type") TypeAbonnement type){
        return iAbonnement.findByTypeAbon(type);
    }

    @GetMapping("/getByDateAbon/{startDate}/{endDate}")
    public List<Abonnement> findByDateDebutBetween(@PathVariable("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate, @PathVariable("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return iAbonnement.findByDateDebutBetween(startDate, endDate);
    }

}
