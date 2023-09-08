package tn.esprit.springproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.ICours;
import tn.esprit.springproject.entities.Cours;

import java.util.List;

@RestController
public class CoursRestController {

    // @Autowired taamalek créaation mtaa instance tak tak
    @Autowired
    ICours iCours;
    @PostMapping("/addCours")
    public Cours addCours(@RequestBody Cours cours){
        return iCours.addCours(cours);
    }
    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours){
        return iCours.updateCours(cours);
    }

    @GetMapping("/getCoursById/{id}")

    public Cours retrieveCoursById(@PathVariable("id") Long id){
        return iCours.retrieveCoursById(id);
    }

    @GetMapping("/getAllCours")
    public List<Cours> retrieveAllSkieurs(){
        return iCours.retrieveAllCours();
    }

    @DeleteMapping("/delCours/{id}")
    public void deleteCours(@PathVariable("id") Long id){
        iCours.deleteCours(id);
    }
}

