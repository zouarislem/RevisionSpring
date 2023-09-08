package tn.esprit.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.entities.Apprenant;
import tn.esprit.entities.Formateur;
import tn.esprit.entities.Formation;
import tn.esprit.repositories.ApprenantRepository;
import tn.esprit.repositories.FormateurRepository;
import tn.esprit.repositories.FormationRepository;

@Slf4j
@Service
public class IServiceImp implements IService {

	@Autowired
	private ApprenantRepository apprenantRepository;

	@Autowired
	private FormationRepository formationRepository;

	@Autowired
	private FormateurRepository formateurRepository;

	@Override
	public void ajouterFormation(Formation formation, Integer idFormateur) {
		Formateur formateur = formateurRepository.findById(idFormateur).orElse(null);

		formation.setFormateur(formateur);
		
		formationRepository.save(formation);

	}

	@Override
	public void addApprenant(Apprenant apprenant) {
		apprenantRepository.save(apprenant);

	}

	@Override
	public void addFormateur(Formateur formateur) {
		formateurRepository.save(formateur);

	}

	@Override
	public void affecterApprenantFormation(Integer idFormation, Integer idApprenant) {
		Formation formation = formationRepository.findById(idFormation).orElse(null);
		Apprenant apprenant = apprenantRepository.findById(idApprenant).orElse(null);

		if(formation.getNbrMaxParticipant() > formation.getApprenants().size()) {
			formation.getApprenants().add(apprenant);
			formationRepository.save(formation);
		}else {
			log.info("Nombre maximal atteinte");
		}
		
		
		
	}

	@Override
	public float getFormateurRemunerationByDate(Integer idFormateur, Date dateDebut, Date dateFin) {
		// stream
		float somme1 = (float) formationRepository.findAll().stream()
		.filter(f -> f.getDateDebut().after(dateDebut) 
				&& f.getDateFin().before(dateFin) 
				&& f.getFormateur().getId().equals(idFormateur))
		.collect(Collectors.summarizingDouble(f ->  f.getNbrHeures() * f.getFormateur().getTarifHoraire()))
		.getSum();
		
		// façon simple
		Formateur formateur = formateurRepository.findById(idFormateur).orElse(null);
		List<Formation> formations = formateur.getFormations();
		float somme2 = 0;
		for (Formation formation : formations) {
		   if(formation.getDateDebut().after(dateDebut)  && formation.getDateFin().before(dateFin)) {
			   somme2 += formation.getNbrHeures() * formation.getFormateur().getTarifHoraire();
		   }	
		}
		return somme1;
	}

	@Scheduled(fixedRate = 300000)
	@Override
	public void getNbrApprenantByFormation() {
		formationRepository.findAll().stream()
		.forEach(f->{
			log.info("Le nombre des apprenants de la formation "+ f.getTitre()+" est égale à "+ f.getApprenants().size());
		});

	}

	@Override
	public int getRevenuByFormation(Integer idFormation) {
		Formation formation = formationRepository.findById(idFormation).orElse(null);
		return formation.getFrais() * formation.getApprenants().size();
	}

}
