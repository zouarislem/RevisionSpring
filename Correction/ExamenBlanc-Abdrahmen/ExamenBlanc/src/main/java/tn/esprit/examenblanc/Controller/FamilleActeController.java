package tn.esprit.examenblanc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenblanc.Entities.FamilleActe;
import tn.esprit.examenblanc.Services.IFamilleActe;
@RestController
public class FamilleActeController {
    @Autowired
    IFamilleActe familleActe;
    @PostMapping("/ajouterFamilleActeEtActeAssocie")
    FamilleActe ajouterFamilleActeEtActeAssocie3(@RequestBody FamilleActe fA){
        return familleActe.ajouterFamilleActeEtActeAssocie3(fA);
    }
}
