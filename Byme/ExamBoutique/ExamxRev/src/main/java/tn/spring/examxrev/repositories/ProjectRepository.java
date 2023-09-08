package tn.spring.examxrev.repositories;

import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.examxrev.entities.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
