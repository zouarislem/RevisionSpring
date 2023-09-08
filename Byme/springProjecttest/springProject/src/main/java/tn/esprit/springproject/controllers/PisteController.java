package tn.esprit.springproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.repositories.PisteRepository;

import java.util.List;

@RestController

public class PisteController {

    @Autowired
    PisteRepository pisteRepository;

    @PostMapping("/addpiste")
    public Piste addPiste(Piste piste){
        return pisteRepository.save(piste);
    }

    @PutMapping("/updatepiste")
    public Piste updatePiste(Piste piste){
        return pisteRepository.save(piste);
    }

    @DeleteMapping("/deletepiste/{}id")
    public void deletePiste(@PathVariable("id") Long id){
        pisteRepository.deleteById(id);
    }

    @GetMapping("/affpiste")
    public List<Piste> retrievePiste(){
        return pisteRepository.findAll();
    }

}
