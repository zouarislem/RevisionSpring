package tn.esprit.examenblanc.Repositories;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.JavaParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.examenblanc.Entities.Acte;

import java.util.List;

@Repository
public interface ActeRepository extends JpaRepository<Acte,Long> {
    Acte findActeByCodeActe(String code);
    @Query("select count(acte) from  Acte acte join acte.pathologies path where path.idPathologie=:id ")
    int countActesByPathologies(@Param("id") long id);
}
