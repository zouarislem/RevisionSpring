package com.revision.revision.repositories;

import com.revision.revision.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {
public List<Skieur> findByAbonnementPrixAbon(Float prix);

}
