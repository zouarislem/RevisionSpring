package tn.esprit.examenblanc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.Pathologie;
import tn.esprit.examenblanc.Services.IPathologieService;

@RestController
@RequestMapping("/pathologie")
public class PathologieRestController {
    @Autowired
    IPathologieService pathologieService;
    @PostMapping("/ajouterPathologie")
  Pathologie  ajouterPathologie1(@RequestBody Pathologie p){
        return pathologieService.ajouterPathologie1(p);
    }
    @GetMapping("/calculer/{id}")
    float calculerFacture5(@PathVariable("id") String identifiant){
        return pathologieService.calculerFacture5(identifiant);
    }
}
