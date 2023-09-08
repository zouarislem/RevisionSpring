package tn.esprit.newexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.newexam.entities.Musee;
import tn.esprit.newexam.entities.Zone;
import tn.esprit.newexam.services.IServices;

@RestController
public class Controller {
    @Autowired
    IServices iServices;

 @PostMapping("/ajouMusee")
 public Musee ajouterMusee(@RequestBody Musee musee){
     return iServices.ajouterMusee(musee);
 }

    @PostMapping("ajouterZoneEtAffecterAMusee/{idMusee}")
    public Zone ajouterZoneEtAffecterAMusee(@RequestBody Zone zone, @PathVariable("idMusee") Long idMusee) {
        return iServices.ajouterZoneEtAffecterAMusee(zone, idMusee);
    }
}
