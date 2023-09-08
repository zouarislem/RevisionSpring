package tn.esprit.examenblanc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.Acte;
import tn.esprit.examenblanc.Entities.Pathologie;
import tn.esprit.examenblanc.Entities.Patient;
import tn.esprit.examenblanc.Repositories.PathologieRepository;
import tn.esprit.examenblanc.Repositories.PatientRepository;

import java.util.List;

@Service
public class PatientServiceImpl implements IPatientService{
    @Autowired
    PathologieRepository pathologieRepository;
    @Autowired
    PatientRepository patientRepository;
    @Override
    public Patient creerPatientEtAffecterAPathologie2(Patient patient, String codePath) {
        Pathologie pathologie=pathologieRepository.findPathologieByCodePath(codePath);

        patient.getPathologies().add(pathologie);

        return patientRepository.save(patient);
    }


}
