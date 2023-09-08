package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entities.Piste;
import tn.esprit.springproject.entities.Skieur;

import java.util.List;
import java.util.Set;

public interface PisteRepository extends JpaRepository<Piste, Integer> {
    // Afficher les Skieurs d'une piste => taatih Id taa piste yrajaalek liste taa skieurs li feha ( Association Many to Many déja w feha une table associative binéthom ezeouz)

}
