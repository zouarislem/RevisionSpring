package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor // Constructeur sans paramétres
@ToString // ToString w Hashcode
@AllArgsConstructor // Constructeur avec touts les paramétres
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours TypeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int creneau;
    // Association
    @OneToMany(mappedBy = "cours")
    private Set<Inscription> inscription;
}
