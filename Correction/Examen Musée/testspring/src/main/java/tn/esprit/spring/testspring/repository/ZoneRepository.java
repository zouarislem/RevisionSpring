package tn.esprit.spring.testspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.testspring.entities.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Long> {
}
