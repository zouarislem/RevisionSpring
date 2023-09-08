package tn.spring.examenmedecin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examenmedecin.entities.Medecin;

import javax.print.attribute.standard.MediaName;
@Repository
public interface MedecinRepo extends JpaRepository<Medecin, Long> {
}
