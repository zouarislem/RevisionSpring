package tn.esprit.examenblanc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.Acte;
import tn.esprit.examenblanc.Entities.Pathologie;
import tn.esprit.examenblanc.Entities.Patient;
import tn.esprit.examenblanc.Repositories.ActeRepository;
import tn.esprit.examenblanc.Repositories.PathologieRepository;
import tn.esprit.examenblanc.Repositories.PatientRepository;

@Service
public class ActeServiceImpl implements IActeService{
@Autowired
    ActeRepository acteRepository;
@Autowired
    PathologieRepository pathologieRepository;

@Autowired
    PatientRepository patientRepository;
    @Override
    public void affecterActeAPatient4(String codeActe, String codePathologie) {
        Acte acte=acteRepository.findActeByCodeActe(codeActe);
        Pathologie pathologie=pathologieRepository.findPathologieByCodePath(codePathologie);

        pathologie.getActes().add(acte);
        acteRepository.save(acte);
    }
}
