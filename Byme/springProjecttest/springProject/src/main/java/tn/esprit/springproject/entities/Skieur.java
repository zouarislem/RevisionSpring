package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;

    private String nomS;

    private String prenomS;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String ville;

    @JsonIgnore // Pour ne pas entrer dans une boucle infinie
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Piste> pistes;

    @OneToOne
    private Abonnement abonnement;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;


}
