package tn.esprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.entities.Apprenant;

public interface ApprenantRepository extends JpaRepository<Apprenant, Integer> {

}
