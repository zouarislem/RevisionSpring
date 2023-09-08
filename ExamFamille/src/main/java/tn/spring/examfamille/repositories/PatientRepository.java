package tn.spring.examfamille.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examfamille.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
