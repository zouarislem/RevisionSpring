package tn.esprit.newexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.newexam.entities.CentreCommercial;
@Repository
public interface CentreRepos extends JpaRepository<CentreCommercial, Long> {
}
