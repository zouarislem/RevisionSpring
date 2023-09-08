package tn.spring.examfamille.services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.examfamille.entities.Acte;
import tn.spring.examfamille.entities.FamilleActe;
import tn.spring.examfamille.entities.Pathologie;
import tn.spring.examfamille.entities.Patient;
import tn.spring.examfamille.repositories.ActeRepository;
import tn.spring.examfamille.repositories.FamilleActeRepository;
import tn.spring.examfamille.repositories.PathologieRepository;
import tn.spring.examfamille.repositories.PatientRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Service
public class services implements IServices {
    @Autowired
    PathologieRepository pathologieRepository;
    PatientRepository patientRepository;
    ActeRepository acteRepository;
    FamilleActeRepository familleActeRepository;


    @Override
    public void affecterActeAPathologie(String codeActe, String codePathologie) {
        Acte acte = acteRepository.findActeByCodeActe(codeActe);
        Pathologie path = pathologieRepository.findPathologieByCodePath(codePathologie);
        if ( path.getArchive()){
           path.getActes().add(acte);
           acteRepository.save(acte);
        }
    }

    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
        List<Acte> actes = facte.getActes();
        for (Acte acte: actes

             ) {
        acte.setFamilleActe(facte);
        acteRepository.save(acte);
        }
        return familleActeRepository.save(facte);
    }

    @Override
    public Patient ajouterPatientEtAffecterAPathologie(Patient patient, String codePath) {

        private static final Logger logger = LoggerFactory.getLogger(services.class);
       Pathologie path = pathologieRepository.findPathologieByCodePath(codePath);
       patient.getPathologies().add(path);
       logger.info("here");
       return patientRepository.save(patient);
    }

    @Override
    public Pathologie ajouterPathologie(Pathologie path) {
        return pathologieRepository.save(path);
    }
}
