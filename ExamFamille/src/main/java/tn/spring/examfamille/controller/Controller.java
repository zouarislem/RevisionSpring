package tn.spring.examfamille.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.spring.examfamille.entities.FamilleActe;
import tn.spring.examfamille.entities.Pathologie;
import tn.spring.examfamille.entities.Patient;
import tn.spring.examfamille.services.IServices;

@RestController
@AllArgsConstructor
public class Controller {
    IServices iServices;

    @PostMapping("/addPatho")
    public Pathologie ajouterPathologie(@RequestBody Pathologie path){
        return iServices.ajouterPathologie(path);
    }

@PostMapping("/addPatAndCode/{codePath}")
    public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient p, @PathVariable("codePath") String codePath) {
   return iServices.ajouterPatientEtAffecterAPathologie(p, codePath);
    }

@PostMapping("/addFamAndActe")
    public FamilleActe ajouterFamilleActeEtActeAssocie (@RequestBody FamilleActe facte) {
        return  iServices.ajouterFamilleActeEtActeAssocie(facte);
    }

    @PutMapping("/ActeAPath/{codeActe}/{codePathologie}")
    public void affecterActeAPathologie(@PathVariable("codeActe") String codeActe,@PathVariable("codePathologie") String codePathologie)
    {
        iServices.affecterActeAPathologie(codeActe, codePathologie);
    }


    }
