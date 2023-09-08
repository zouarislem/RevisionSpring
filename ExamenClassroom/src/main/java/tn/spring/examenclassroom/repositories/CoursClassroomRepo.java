package tn.spring.examenclassroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.examenclassroom.entities.CoursClassroom;
@Repository
public interface CoursClassroomRepo extends JpaRepository<CoursClassroom, Integer> {
}
