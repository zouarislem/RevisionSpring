package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Inscription;
import tn.esprit.springproject.entities.Support;
import tn.esprit.springproject.services.IInscription;
import tn.esprit.springproject.services.InscriptionService;

import java.util.List;

@RestController
@AllArgsConstructor
public class InscriptionController {


    IInscription iInscription;

    @PostMapping("/addandassignskieur/{numSkieur}")
    public Inscription addInscriptionAndAssignToSkieur(@RequestBody Inscription inscription,@PathVariable("numSkieur") Long numSkieur){
        return iInscription.addInscriptionAndAssignToSkieur(inscription,numSkieur);
    }

    @PostMapping("/assigncours/{numCours}/{numIns}")
    public Inscription addInscriptionAndAssignToCours(@PathVariable("numIns") Long numIns,@PathVariable("numCours") Long numCours){
        return iInscription.addInscriptionAndAssignToCours(numIns,numCours);
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
