package tn.spring.examenmagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.examenmagasin.entities.Entreprise;
@Repository
public interface EntrepriseRepo extends JpaRepository<Entreprise, Long> {
       // public void findByEmployeCategorieCHEFRAYON();

}
