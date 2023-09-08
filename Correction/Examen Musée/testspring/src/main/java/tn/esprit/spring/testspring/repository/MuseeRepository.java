package tn.esprit.spring.testspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.testspring.entities.Musee;

public interface MuseeRepository extends JpaRepository<Musee, Long> {
}
