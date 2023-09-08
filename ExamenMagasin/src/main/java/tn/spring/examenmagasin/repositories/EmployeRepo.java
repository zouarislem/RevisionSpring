package tn.spring.examenmagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.examenmagasin.entities.Employe;

public interface EmployeRepo extends JpaRepository<Employe,Long> {
    public Employe findByIdentifiant (long identifiant);
}
