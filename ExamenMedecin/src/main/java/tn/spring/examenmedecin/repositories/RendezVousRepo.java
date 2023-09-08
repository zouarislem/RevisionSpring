package tn.spring.examenmedecin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examenmedecin.entities.RendezVous;
@Repository
public interface RendezVousRepo extends JpaRepository<RendezVous, Long> {
}
