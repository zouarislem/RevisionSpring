package com.example.b.repositories;

import com.example.b.entities.Bibliotheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliothequeRepository extends JpaRepository<Bibliotheque, Long> {
}
