package tn.esprit.examenblanc.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.Acte;
import tn.esprit.examenblanc.Entities.Pathologie;
import tn.esprit.examenblanc.Entities.Patient;
import tn.esprit.examenblanc.Repositories.ActeRepository;
import tn.esprit.examenblanc.Repositories.PathologieRepository;

import java.util.Set;

@Service
@Slf4j
public class PathologieServiceImpl implements IPathologieService{
    @Autowired
    PathologieRepository pathologieRepository;
    @Autowired
    ActeRepository acteRepository;
    @Override
    public Pathologie ajouterPathologie1(Pathologie p) {
        return pathologieRepository.save(p);
    }
@Scheduled(fixedDelay = 30000)
    public void calculerNombreActeParPathologie6() {

       for(Pathologie p:pathologieRepository.findAll())
             log.info("Le nombre d'actes pour la pathologie "+p.getLibelle()+" est :"+ acteRepository.countActesByPathologies(p.getIdPathologie()));


    }
    @Override
    public float calculerFacture5(String identifiant) {
        float  facture=0;
        Pathologie pathologie=null;
        if(pathologieRepository.findPathologieByLibelle(identifiant)!=null) {
            pathologie=pathologieRepository.findPathologieByLibelle(identifiant);
        } else if (pathologieRepository.findPathologieByCodePath(identifiant)!=null) {
            pathologie=pathologieRepository.findPathologieByCodePath(identifiant);
        }


        if(pathologie.getArchive()==false) {
                for(Acte acte:pathologie.getActes()){
                    facture=facture+(acte.getCotationActe()*acte.getPrixUnitaireActe());
                }
            }

        else log.info("La pathologie est archivée");
        return facture;
    }
}