package tn.spring.examfamille.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examfamille.entities.Acte;
@Repository
public interface ActeRepository extends JpaRepository<Acte, Long> {

Acte findActeByCodeActe(String codeActe);
}
