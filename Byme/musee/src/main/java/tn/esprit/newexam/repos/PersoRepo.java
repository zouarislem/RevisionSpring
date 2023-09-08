package tn.esprit.newexam.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.newexam.entities.Personnel;

public interface PersoRepo extends JpaRepository<Personnel, Long> {
}
