package tn.esprit.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springproject.entities.Abonnement;
import tn.esprit.springproject.entities.Skieur;
import tn.esprit.springproject.entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur, Long> {

    // Recherche par Nom et Prenom du Skieur
    public Skieur findByNomSAndPrenomS(String nom, String prenom);
    public List<Skieur> findByPistesIdPiste(Integer a);

    //JQPA
    public List<Skieur> findByAbonnementPrixAbon(Float prix);
    // Query SQL (NativeSQL = true)
    @Query("SELECT S FROM Skieur S INNER JOIN Abonnement a on S.abonnement.numAbon=a.numAbon WHERE a.prixAbon=:prix")
    public List<Skieur> retrieveByPrixAbonnement(@Param("prix") Float prix);

    // JPQL => Jointure implicite ( Pas de requête Insert => Insert uses native SQL)
    @Query("SELECT S from Skieur S, Abonnement A where A.prixAbon=:prix")
    public List<Skieur> retrieveByPrix(@Param("prix") Float prix );


    @Query("SELECT S FROM Skieur S, Abonnement a where a.typeAbon=?1")
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    Skieur findByAbonnement(Abonnement abonnement);

}
