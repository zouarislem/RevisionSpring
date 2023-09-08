package tn.esprit.examenblanc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Pathologie;
import tn.esprit.examenblanc.Entities.Patient;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findPatientByIdentifiantPieceIDentite(String identite);

}
