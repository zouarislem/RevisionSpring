package tn.esprit.newexam.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.newexam.entities.Zone;

public interface ZoneRepo extends JpaRepository<Zone, Long> {
}
