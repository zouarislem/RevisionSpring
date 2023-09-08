package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.PisteRepository;
import tn.esprit.springproject.entities.Piste;

import java.util.List;

@Service
public class PisteServiceImplementation implements IPiste{

    @Autowired
    PisteRepository pisteRepository;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePisteById(Integer id) {
        return pisteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public void deletePiste(Integer id) {
    pisteRepository.deleteById(id);
    }
}
