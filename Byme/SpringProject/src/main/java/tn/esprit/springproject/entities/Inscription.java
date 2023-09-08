package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor // Constructeur sans paramétres
@ToString // ToString w Hashcode
@AllArgsConstructor // Constructeur avec touts les paramétres
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;
    private int numSemaine;
    // création de l'asasociation bidirectionnal entre inscri et skieur
    @ManyToOne
    @JsonIgnore // pour éviter les boucles
    private Skieur skieur;
    @ManyToOne
    @JsonIgnore
    private Cours cours;
}