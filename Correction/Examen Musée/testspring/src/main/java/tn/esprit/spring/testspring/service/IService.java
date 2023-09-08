package tn.esprit.spring.testspring.service;

import tn.esprit.spring.testspring.entities.Direction;
import tn.esprit.spring.testspring.entities.Musee;
import tn.esprit.spring.testspring.entities.OeuvreArt;
import tn.esprit.spring.testspring.entities.Zone;

import java.util.List;

public interface IService {
    Musee ajouterMusee(Musee musee);
    public Zone ajouterZoneEtAffecterAMusee (Zone zone, Long idMusee);

    OeuvreArt ajouterOeuvreArtEtAffecterAZone(OeuvreArt oeuvreArt, Long idZone);

    void affecterPersonnelsAZone(Long idZone, Long idGardien, Long idDirecteur);
    List<String> titreTableauParMuseeEtDirection(Long idMusee, Direction direction) ;

    void desaffecterDirecteursZoneInactif() ;
}
