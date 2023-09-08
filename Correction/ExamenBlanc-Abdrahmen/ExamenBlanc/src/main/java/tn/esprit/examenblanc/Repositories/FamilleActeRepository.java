package tn.esprit.examenblanc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.FamilleActe;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamilleActe,Long> {
}
