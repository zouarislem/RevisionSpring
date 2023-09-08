package tn.esprit.newexam.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.newexam.entities.Direction;
import tn.esprit.newexam.entities.OeuvreArt;

import java.util.List;

public interface OeuvreRepo extends JpaRepository<OeuvreArt, Long> {
//
}
