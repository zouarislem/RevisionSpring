package com.example.b.repositories;

import com.example.b.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    List<Livre> findByRayonIdRayonAndRayonBibliothequeIdBibliotheque(Long idRayon,Long idBibliotheque);

}
