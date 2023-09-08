package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor // Constructeur sans paramétres
//@ToString // ToString w Hashcode
@AllArgsConstructor // Constructeur avec touts les paramétres
public class Piste implements Serializable { // Serializable compresses data ( in a .byte format) for backup

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Integer idPiste; // Clé primaire
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

    // Asociation many to many
    @ManyToMany(mappedBy = "pistes") // mappedBy t7otha win t7eb f ay entité fel ManyToMany lmouhem wa7da barka
    @JsonIgnore // Pour ne pas entrer dans une boucle infinie
    private Set<Skieur> skieur;
}
