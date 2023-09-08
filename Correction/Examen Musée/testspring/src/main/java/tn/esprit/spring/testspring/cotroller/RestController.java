package tn.esprit.spring.testspring.cotroller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.spring.testspring.entities.*;
import tn.esprit.spring.testspring.service.IService;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@AllArgsConstructor
public class RestController {
    private IService iService;

    @PostMapping("ajouterMusee")
    public Musee ajouterMusee(@RequestBody Musee musee) {
        return iService.ajouterMusee(musee);
    }

    @PostMapping("ajouterZoneEtAffecterAMusee/{idMusee}")
    public Zone ajouterZoneEtAffecterAMusee(@RequestBody Zone zone, @PathVariable("idMusee") Long idMusee) {
        return iService.ajouterZoneEtAffecterAMusee(zone, idMusee);
    }

    @PostMapping("ajouterOeuvreArtEtAffecterAZone/{idZone}")
    public OeuvreArt ajouterOeuvreArtEtAffecterAZone(@RequestBody OeuvreArt oeuvreArt, @PathVariable Long idZone) {
        return iService.ajouterOeuvreArtEtAffecterAZone(oeuvreArt, idZone);
    }

    @PostMapping("affecterPersonnelsAZone/{idZone}/{idGardien}/{idDirecteur}")
    public void affecterPersonnelsAZone(@PathVariable("idZone") Long idZone, @PathVariable("idGardien") Long idGardien,@PathVariable("idDirecteur") Long idDirecteur) {
       iService.affecterPersonnelsAZone(idZone, idGardien,idDirecteur);
    }


    @GetMapping("titreTableauParMuseeEtDirection/{idMusee}/{direction}")
    public List<String> titreTableauParMuseeEtDirection(@PathVariable("idMusee") Long idMusee, @PathVariable("direction") Direction direction) {
      return iService.titreTableauParMuseeEtDirection(idMusee, direction);
    }
}
