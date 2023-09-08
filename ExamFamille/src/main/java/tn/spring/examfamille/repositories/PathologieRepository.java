package tn.spring.examfamille.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.examfamille.entities.Pathologie;
@Repository
public interface PathologieRepository extends JpaRepository<Pathologie, Long> {

    Pathologie findPathologieByCodePath(String codePath);
}
