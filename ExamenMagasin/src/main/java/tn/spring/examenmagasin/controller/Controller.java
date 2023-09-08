package tn.spring.examenmagasin.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.examenmagasin.entities.Employe;
import tn.spring.examenmagasin.entities.Entreprise;
import tn.spring.examenmagasin.entities.Rayon;
import tn.spring.examenmagasin.services.IServices;

@RestController
@AllArgsConstructor
public class Controller {
    IServices iServices;

@PostMapping("/ajouterEmploye")
    public Employe ajouterEmplyer (@RequestBody Employe employe){
        return iServices.ajouterEmplyer(employe);
    }

    @PostMapping("/ajouterRayon")
    public Rayon ajouterRayon(@RequestBody Rayon rayon) {
        return iServices.ajouterRayon(rayon);
}

@PostMapping("/assEntreAndMagas")
    public Entreprise ajouterEntrepriseEtMagasinAssocies(@RequestBody Entreprise entreprise) {
        return iServices.ajouterEntrepriseEtMagasinAssocies(entreprise);

    }

    @PostMapping("/AffecteEmployeARayon/{id}/{coderayon}")
    public Employe affecterEmployeARayon(@PathVariable("id") Long identifiant,@PathVariable("coderayon") String codeRayon) {
        return iServices.affecterEmployeARayon(identifiant, codeRayon);
}


@PostMapping("/affecterEmplAMagasin/{id}/{idm}")
    public Employe affecterEmployeAMagasin(@PathVariable("id") Long identifiant,@PathVariable("idm") Long idMagasin) {
return  iServices.affecterEmployeAMagasin(identifiant, idMagasin);
}

    }
