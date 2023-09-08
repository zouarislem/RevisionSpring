package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.entities.Moniteur;

import javax.management.monitor.Monitor;

public interface MonitorRepository extends JpaRepository<Moniteur, Long> {
}
