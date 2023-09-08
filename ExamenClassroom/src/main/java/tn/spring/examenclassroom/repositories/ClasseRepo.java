package tn.spring.examenclassroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examenclassroom.entities.Classe;
@Repository
public interface ClasseRepo extends JpaRepository<Classe, Integer> {
}
