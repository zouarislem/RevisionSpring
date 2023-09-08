package tn.spring.examfamille.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.examfamille.entities.FamilleActe;

public interface FamilleActeRepository extends JpaRepository<FamilleActe, Long> {
}
