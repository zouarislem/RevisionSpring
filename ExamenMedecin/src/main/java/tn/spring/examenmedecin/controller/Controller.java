package tn.spring.examenmedecin.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.examenmedecin.entities.Clinique;
import tn.spring.examenmedecin.entities.Medecin;
import tn.spring.examenmedecin.services.IServices;

@RestController

public class Controller {
    @Autowired
IServices iServices;
@PostMapping("/addClinique")
    public Clinique addClinique (@RequestBody Clinique clinique){

        return iServices.addClinique(clinique);
    }

@PostMapping("/addMedecinAndAssignToClinique/{cliniqueId}")
    public Medecin addMedecinAndAssignToClinique (@RequestBody Medecin medecin, @PathVariable("cliniqueId") Long cliniqueId){
    return iServices.addMedecinAndAssignToClinique(medecin, cliniqueId);
    }

}
