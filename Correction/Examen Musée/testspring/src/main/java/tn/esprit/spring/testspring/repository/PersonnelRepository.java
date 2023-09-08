package tn.esprit.spring.testspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.testspring.entities.Personnel;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
}
