package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.MoniteurRepository;
import tn.esprit.springproject.entities.Moniteur;

import java.util.List;
@Service
public class MoniteurServiceImplementation implements IMoniteur {

    @Autowired
    MoniteurRepository moniteurRepository;
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
}
