package com.revision.revision.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numAbon;

    public LocalDate dateDebut;



    public LocalDate dateFin;
    public float prixAbon;
    @Enumerated
    public TypeAbonnement typeAbonnement;

}
