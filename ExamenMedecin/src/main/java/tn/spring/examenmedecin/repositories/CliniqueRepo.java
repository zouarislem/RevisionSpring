package tn.spring.examenmedecin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examenmedecin.entities.Clinique;
@Repository
public interface CliniqueRepo extends JpaRepository<Clinique, Long> {
}
