package tn.spring.examenclassroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.spring.examenclassroom.entities.Niveau;
import tn.spring.examenclassroom.entities.Utilisateur;
@Repository
public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer> {

@Query("Select count(u) from Utilisateur u join u.classe c WHERE c.niveau=:nv GROUP BY  c.niveau")
    public int nbUtilisateurParNiveau(@Param("nv") Niveau nv);
}