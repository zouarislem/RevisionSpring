package tn.esprit.examenblanc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenblanc.Entities.Acte;
import tn.esprit.examenblanc.Services.IActeService;

@RestController
public class ActeRestController {
    @Autowired
    IActeService acteService;
    @PutMapping("/affectActePatient/{code-Acte}/{code-patho}")
    void affecterActeAPatient4(@PathVariable("code-Acte") String codeActe, @PathVariable("code-patho") String codePathologie){
        acteService.affecterActeAPatient4(codeActe,codePathologie);
    }
}
