package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.CoursRepository;
import tn.esprit.springproject.Repository.MoniteurRepository;
import tn.esprit.springproject.entities.Cours;
import tn.esprit.springproject.entities.Moniteur;
import tn.esprit.springproject.entities.Support;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MoniteurServiceImplementation implements IMoniteur {

    @Autowired
    MoniteurRepository moniteurRepository;
    @Autowired
    CoursRepository coursRepository;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteurById(Long id) {
        return moniteurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public void deleteMoniteur(Long id) {
    moniteurRepository.deleteById(id);
    }

    @Override
    public Moniteur addMoniteurAndAssignToCours(Moniteur m, Long numCours) {
        Cours cours = coursRepository.findById(numCours).orElse(null);
        Set<Cours> coursSet=new HashSet<>();
        coursSet.add(cours);
        m.setCours(coursSet);
        return moniteurRepository.save(m);
    }



}

