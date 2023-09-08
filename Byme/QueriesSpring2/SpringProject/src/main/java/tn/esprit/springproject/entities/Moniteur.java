package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor // Constructeur sans paramétres
@ToString // ToString w Hashcode
@AllArgsConstructor // Constructeur avec touts les paramétres
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private Date dateRecru;

    // Création de l'entité OneToMany
    @OneToMany
    private Set<Cours> cours; // set heya List<> ordonnées , donc najmou ne5dmou b List<Cours> aadi

}


