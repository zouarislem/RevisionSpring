package com.example.b.repositories;

import com.example.b.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {

}
