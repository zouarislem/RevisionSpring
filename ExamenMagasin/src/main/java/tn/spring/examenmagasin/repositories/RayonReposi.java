package tn.spring.examenmagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.examenmagasin.entities.Rayon;

import java.util.List;

@Repository
public interface RayonReposi extends JpaRepository<Rayon,Long> {
@Query("Select r from Rayon r where r.codeRayon=:codeRayon ")
    public Rayon findbycoderayon (String codeRayon);
}
