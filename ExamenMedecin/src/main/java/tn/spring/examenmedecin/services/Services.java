package tn.spring.examenmedecin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.examenmedecin.entities.Clinique;
import tn.spring.examenmedecin.entities.Medecin;
import tn.spring.examenmedecin.repositories.CliniqueRepo;
import tn.spring.examenmedecin.repositories.MedecinRepo;

@Service
public class Services implements  IServices{
@Autowired
    CliniqueRepo cliniqueRepo;
    MedecinRepo medecinRepo;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepo.save(clinique);
    }

    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clini = cliniqueRepo.findById(cliniqueId).orElse(null);
        clini.getMedecins().add(medecin);
        return medecinRepo.save(medecin);
    }
}
