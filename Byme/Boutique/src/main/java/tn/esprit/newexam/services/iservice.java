package tn.esprit.newexam.services;

import tn.esprit.newexam.entities.Boutique;
import tn.esprit.newexam.entities.CentreCommercial;
import tn.esprit.newexam.entities.Client;

import java.util.List;

public interface iservice {
    void ajouCentre(CentreCommercial centre);
    public Boutique ajouBoutique(CentreCommercial centre);
    void ajouterEtaffecterListeboutique (List<Boutique> lb, Long idCentre);
    void ajouterEtAffecterClientBoutiques(Client client, List<Long> idBoutiques);
}
