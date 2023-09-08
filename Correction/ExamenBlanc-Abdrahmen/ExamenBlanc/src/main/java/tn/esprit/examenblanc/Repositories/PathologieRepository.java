package tn.esprit.examenblanc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Pathologie;

import java.util.List;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie,Long> {
    Pathologie findPathologieByCodePath(String code);
    Pathologie findPathologieByLibelle(String identifiant);

}
