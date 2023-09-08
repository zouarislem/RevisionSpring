package tn.esprit.spring.testspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.testspring.entities.Direction;
import tn.esprit.spring.testspring.entities.OeuvreArt;

import java.util.List;

public interface OeuvreArtRepository extends JpaRepository<OeuvreArt, Long> {
    List<OeuvreArt> findByZoneMuseeMuseeIdAndZoneDirection(Long idMusee, Direction direction);
}
