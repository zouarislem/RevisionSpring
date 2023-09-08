package tn.esprit.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import tn.esprit.entities.Apprenant;
import tn.esprit.entities.Formateur;
import tn.esprit.entities.Formation;
import tn.esprit.services.IService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
public class RestController {

	@Autowired
	private IService service;


	//localhost:8090/rest/add-apprenant
	@PostMapping("/add-apprenant")
	public void addApprenant(@RequestBody Apprenant apprenant) {
		service.addApprenant(apprenant);
	}

	//	localhost:8090/rest/add-formateur
	@PostMapping("/add-formateur")
	public void addFormateur(@RequestBody Formateur formateur) {
		service.addFormateur(formateur);
	}

	//localhost:8090/rest/add-formation/{idFormateur}
	@PostMapping("/add-formation/{idFormateur}")
	public void addFormation(@RequestBody Formation formation, @PathVariable Integer idFormateur) {
		service.ajouterFormation(formation, idFormateur);
	}

	@PutMapping("/affecter-apprenant-formation/{idFormation}/{idApprenant}")
	public void affecterApprenantFormation(@PathVariable Integer idFormation, @PathVariable Integer idApprenant) {
		service.affecterApprenantFormation(idFormation, idApprenant);
	}

	@GetMapping("/get-formateur-remuneration-by-date/{idFormateur}/{dateDebut}/{dateFin}")
	public float  getFormateurRemunerationByDate(@PathVariable Integer idFormateur,@PathVariable String dateDebut,@PathVariable String dateFin) throws ParseException {

		Date dateDebutParsed=new SimpleDateFormat("yyyy-MM-dd").parse(dateDebut);
		Date dateFinParsed=new SimpleDateFormat("yyyy-MM-dd").parse(dateFin);
		return service.getFormateurRemunerationByDate(idFormateur,dateDebutParsed,dateFinParsed);
	}

	@GetMapping("/get-revenu-by-formation/{idFormation}")
	public int getRevenuByFormation(Integer idFormation) {
		return service.getRevenuByFormation(idFormation);
	}

}
