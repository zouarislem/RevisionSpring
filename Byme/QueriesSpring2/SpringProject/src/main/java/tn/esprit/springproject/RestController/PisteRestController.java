package tn.esprit.springproject.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Services.IPiste;
import tn.esprit.springproject.Services.ISkieur;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;

@RestController
public class PisteRestController {

    // @Autowired taamalek créaation mtaa instance tak tak
    @Autowired
    IPiste iPiste;
    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste){
        return iPiste.addPiste(piste);
    }
    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste){
        return iPiste.updatePiste(piste);
    }

    @GetMapping("/getPisteById/{id}")

    // @Pathvariable ki t7eb taati ID fel route
    public Piste retrievePisteById(@PathVariable("id") Integer id){
        return iPiste.retrievePisteById(id);
    }

    @GetMapping("/getAllPistes")
    public List<Piste> retrieveAllPistes(){
        return iPiste.retrieveAllPistes();
    }

    @DeleteMapping("/delPiste/{id}")
    public void deletePiste(@PathVariable("id") Integer id){
        iPiste.deletePiste(id);
    }
}

