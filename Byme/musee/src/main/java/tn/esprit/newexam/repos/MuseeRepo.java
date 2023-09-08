package tn.esprit.newexam.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.newexam.entities.Musee;

public interface MuseeRepo extends JpaRepository<Musee, Long> {
}
