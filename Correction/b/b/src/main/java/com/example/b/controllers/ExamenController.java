package com.example.b.controllers;

import com.example.b.entities.Bibliotheque;
import com.example.b.entities.Livre;
import com.example.b.entities.Personnel;
import com.example.b.entities.Rayon;
import com.example.b.services.IExamenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/examen")
public class ExamenController {
    private IExamenService examenService;
    // http://localhost:8089/b/examen/ajouter-biblotheque
    @PostMapping("/ajouter-biblotheque")
    public Bibliotheque ajouterBibliotheque(@RequestBody Bibliotheque b) {
        examenService.ajouterBibliotheque(b);
        return b;
    }

    // http://localhost:8089/b/examen/ajouterRayonEtAffecterABibliotheque/1
    @PostMapping("/ajouterRayonEtAffecterABibliotheque/{idBibliotheque}")
    public Rayon ajouterRayonEtAffecterABibliotheque(@RequestBody Rayon r,@PathVariable("idBibliotheque") Long idBibliotheque)
    {
        examenService.ajouterRayonEtAffecterABibliotheque(r,idBibliotheque);
        return r;
    }

    // http://localhost:8089/b/examen/ajouterLivreEtAffecterARayon/1
    @PostMapping("/ajouterLivreEtAffecterARayon/{idRayon}")
    public Livre ajouterLivreEtAffecterARayon(@RequestBody Livre l, @PathVariable("idRayon") Long idRayon)
    {
        examenService.ajouterLivreEtAffecterARayon(l,idRayon);
        return l;
    }

    // http://localhost:8089/b/examen/ajoutPersonnelEtAffecterARayon/100
    @PostMapping("/ajoutPersonnelEtAffecterARayon/{codeRayon}")
    public Personnel ajoutPersonnelEtAffecterARayon(@RequestBody Personnel p, @PathVariable("codeRayon") String codeRayon)
    {
        examenService.ajoutPersonnelEtAffecterARayon(p,codeRayon);
        return p;
    }

    // http://localhost:8089/b/examen/desaffecterPersonnelDuRayon/1
    @PutMapping("/desaffecterPersonnelDuRayon/{idPersonnel}")
    public void desaffecterPersonnelDuRayon(@PathVariable("idPersonnel") Long idPersonnel)
    {
        examenService.desaffecterPersonnelDuRayon(idPersonnel);
    }

    // http://localhost:8089/b/examen/titreLivreParBibliothequeEtRayon/1/1
    @GetMapping("/titreLivreParBibliothequeEtRayon/{idRayon}/{idBibliotheque}")
    public List<String> titreLivreParBibliothequeEtRayon(@PathVariable("idRayon") Long idRayon,@PathVariable("idBibliotheque") Long idBibliotheque)
    {
        return examenService.titreLivreParBibliothequeEtRayon(idRayon,idBibliotheque);
    }




}
