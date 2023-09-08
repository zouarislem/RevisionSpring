package tn.spring.examxrev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examxrev.entities.Sprint;
@Repository
public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}
