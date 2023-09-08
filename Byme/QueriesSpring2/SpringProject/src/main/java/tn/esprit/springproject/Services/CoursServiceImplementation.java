package tn.esprit.springproject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Repository.CoursRepository;
import tn.esprit.springproject.entities.Cours;

import java.util.List;

@Service
public class CoursServiceImplementation implements ICours {

    @Autowired
    CoursRepository coursRepository;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCoursById(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cours> retrieveAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }
}
