package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor // Constructeur sans paramétres
//@ToString // ToString w Hashcode
@AllArgsConstructor // Constructeur avec touts les paramétres
// Lombok pour la création des getters & setters

public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nomSkieur;
    private String nomS;
    private String prenomS;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String ville;

    // Création de l'association one to one unidirectionnelle
    @OneToOne
    private Abonnement abonnement;
    // Création de l'association One To Many bidirectional
    @OneToMany(mappedBy="skieur")
    private Set<Inscription> inscription;

    // Association many to Many bid
    @ManyToMany
    private Set<Piste> pistes;
}
