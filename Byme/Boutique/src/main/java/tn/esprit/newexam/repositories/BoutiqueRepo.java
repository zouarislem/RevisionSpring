package tn.esprit.newexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.newexam.entities.Boutique;

public interface BoutiqueRepo extends JpaRepository<Boutique, Long> {
}
