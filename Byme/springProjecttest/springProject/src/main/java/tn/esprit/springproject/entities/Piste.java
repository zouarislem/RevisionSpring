package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity //pour generer l'entite dans la base
@Getter
@Setter
@ToString
@NoArgsConstructor //cons par defaut
@AllArgsConstructor // cons parametre
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;

    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    private Integer longeur;

    private  Integer pente;
    @ManyToMany(mappedBy = "pistes") //lmapped by tektbha f ay blasa fl manytomany lmouhem f entity wahda
    private Set<Skieur> skieurs;

}
