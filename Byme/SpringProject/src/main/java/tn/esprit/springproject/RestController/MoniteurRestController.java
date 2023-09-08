package tn.esprit.springproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.IMoniteur;
import tn.esprit.springproject.Services.ISkieur;
import tn.esprit.springproject.entities.Moniteur;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;

@RestController
public class MoniteurRestController {

    // @Autowired taamalek créaation mtaa instance tak tak
    @Autowired
    IMoniteur iMoniteur;
    @PostMapping("/addMoniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteur.addMoniteur(moniteur);
    }
    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return iMoniteur.updateMoniteur(moniteur);
    }

    @GetMapping("/getMoniteurById/{id}")

    // @Pathvariable ki t7eb taati ID fel route
    public Moniteur retrieveMoniteurById(@PathVariable("id") Long id){
        return iMoniteur.retrieveMoniteurById(id);
    }

    @GetMapping("/getAllMoniteurs")
    public List<Moniteur> retrieveAllMoniteurs(){
        return iMoniteur.retrieveAllMoniteurs();
    }

    @DeleteMapping("/delMoniteur/{id}")
    public void deleteMoniteur(@PathVariable("id") Long id){
        iMoniteur.deleteMoniteur(id);
    }

    @PostMapping("/addAssign/{numCours}")
    public Moniteur addMoniteurAndassigntCours(@RequestBody Moniteur m ,  @PathVariable Long numCours)
    {
        return iMoniteur.addMoniteurAndAssignToCours(m,numCours);
    }
}

