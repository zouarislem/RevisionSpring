package com.revision.revision.services;

import com.revision.revision.entities.Skieur;
import com.revision.revision.repositories.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkieurServiceImple implements  ISkieur {

    @Autowired
    SkieurRepository skieurRepository;
    @Override
    public Skieur addSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public Skieur UpdateSkieur(Skieur sk) {
        return skieurRepository.save(sk);
    }

    @Override
    public Skieur retrieveSkieurById(long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skieur> retrieveAllSkieur() {
        return skieurRepository.findAll();
    }

    @Override
    public void deleteSkieur(long id) {
            skieurRepository.deleteById(id);
    }

    @Override
    public List<Skieur> findSkieurByAbonnement(Float prix) {
        return skieurRepository.findByAbonnementPrixAbon(prix);
    }
}
