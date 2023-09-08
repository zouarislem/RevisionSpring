package tn.esprit.newexam.services;

import tn.esprit.newexam.entities.Musee;
import tn.esprit.newexam.entities.OeuvreArt;
import tn.esprit.newexam.entities.Zone;

public interface IServices {


    Musee ajouterMusee(Musee musee);

    public Zone ajouterZoneEtAffecterAMusee (Zone zone, Long idMusee);
    OeuvreArt ajouterOeuvreArtEtAffecterAZone(OeuvreArt oeuvreArt, Long idZone);
    void affecterPersonnelsAZone(Long idZone, Long idGardien, Long idDirecteur);
  //  List<String> titreTableauParMuseeEtDirection(Long idMusee, Direction direction) ;

}
