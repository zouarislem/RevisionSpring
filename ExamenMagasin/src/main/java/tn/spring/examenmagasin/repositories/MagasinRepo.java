package tn.spring.examenmagasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examenmagasin.entities.Magasin;

@Repository
public interface MagasinRepo extends JpaRepository<Magasin,Long> {
}
