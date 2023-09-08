package tn.esprit.examenblanc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.Patient;
import tn.esprit.examenblanc.Services.IPatientService;

@RestController
public class PatientRestController {
    @Autowired
    IPatientService patientService;
    @PostMapping("creerPatientEtAffecter/{code-path}")
    Patient creerPatientEtAffecterAPathologie2(@RequestBody Patient p,@PathVariable("code-path") String codePath){
       return patientService.creerPatientEtAffecterAPathologie2(p,codePath);
    }

}
