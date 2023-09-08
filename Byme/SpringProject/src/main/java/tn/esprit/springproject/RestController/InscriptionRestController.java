package tn.esprit.springproject.RestController;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.IInscription;
import tn.esprit.springproject.Services.ISkieur;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.entities.Support;

import java.util.List;

@RestController
@AllArgsConstructor

public class InscriptionRestController {

    // @Autowired taamalek créaation mtaa instance tak tak
   // @Autowired
    IInscription iInscription;
    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription inscription){
        return iInscription.addInscription(inscription);
    }
    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription inscription){
        return iInscription.updateInscription(inscription);
    }

    @GetMapping("/getInscriptionById/{id}")

    // @Pathvariable ki t7eb taati ID fel route
    public Inscription retrieveInscriptionById(@PathVariable("id") Long id){
        return iInscription.retrieveInscriptionById(id);
    }

    @GetMapping("/getAllInscriptions")
    public List<Inscription> retrieveAllInscriptions(){
        return iInscription.retrieveAllInscriptions();
    }

    @DeleteMapping("/delInscription/{id}")
    public void deleteInscription(@PathVariable("id") Long id){
        iInscription.deleteInscription(id);
    }

    @PostMapping("/addInscriptionAndAssignToSkieur/{nomSkieur}")
    public Inscription AddInscriptionAndAssignToSkieur(@RequestBody Inscription inscription,@PathVariable("nomSkieur") Long nomSkieur)
        {
            return iInscription.addInscriptionAndAssignToSkieur(inscription, nomSkieur);

    }

    @PostMapping("/addInscriptionAndAssignToCours/{nomCours}")
    public Inscription AddInscriptionAndAssignToCours(@RequestBody Inscription inscription, @PathVariable("nomCours") Long numCours)
    {
        return iInscription.addInscriptionAndassignToCours(inscription, numCours);
    }

    @PostMapping("/coursski/{numSkieur}/{numCours}")
    public Inscription addRegistrationAndAssignToSkierAndCourse(@RequestBody Inscription inscription, @PathVariable Long numSkieur, @PathVariable Long numCours)
    {
        return iInscription.addRegistrationAndAssignToSkierAndCourse(inscription,numSkieur,numCours);
    }

    @GetMapping("/coursski/{idMon}/{support}")
    List<Integer> numWeeksCourseOfInstructorBySupport(@PathVariable("idMon") Long numMoniteur, @PathVariable("support") Support support){
        return iInscription.numWeeksCourseOfInstructorBySupport(numMoniteur,support);
    }

}

