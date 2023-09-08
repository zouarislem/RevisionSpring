package com.revision.revision.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numCours;
    public int niveau;
    @Enumerated(EnumType.STRING)
    public TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    public Support support;
    public float prix;
    public int creneau;

    @OneToMany(mappedBy = "cour")
    List<Inscription> inscriptions;


}
