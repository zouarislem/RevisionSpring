package com.example.b.repositories;

import com.example.b.entities.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RayonRepository extends JpaRepository<Rayon, Long> {
    Rayon findByCodeRayon(String codeRayon);
}
