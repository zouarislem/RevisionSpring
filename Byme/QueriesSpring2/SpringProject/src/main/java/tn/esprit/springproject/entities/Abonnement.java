package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor // Constructeur sans paramétres
@ToString // ToString w Hashcode
@AllArgsConstructor // Constructeur avec touts les paramétres
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    private Float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;




}
