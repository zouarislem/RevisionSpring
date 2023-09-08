package tn.spring.examenmedecin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examenmedecin.entities.Patient;
@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
}
