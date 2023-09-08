package tn.esprit.examenblanc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.FamilleActe;
import tn.esprit.examenblanc.Repositories.FamilleActeRepository;

@Service
public class FamilleActeServiceIpml implements IFamilleActe{
    @Autowired
    FamilleActeRepository familleActeRepository;
    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie3(FamilleActe fA) {

        return familleActeRepository.save(fA);
    }
}
