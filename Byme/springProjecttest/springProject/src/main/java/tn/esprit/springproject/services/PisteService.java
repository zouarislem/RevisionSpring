package tn.esprit.springproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.repositories.PisteRepository;

import java.util.List;
@Service
public class PisteService implements IPiste{

    @Autowired
    PisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPiste() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void deletePiste(Long id) {
        pisteRepository.deleteById(id);

    }

    @Override
    public Piste updatePiste(Piste piste) {

        return pisteRepository.save(piste);
    }


}
