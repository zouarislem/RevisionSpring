package com.example.b.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonnel;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private  TypePersonnel typePersonnel;
    @OneToOne(mappedBy = "responsable")
    private Rayon rayonResponsable;
    @ManyToOne
    private Rayon  rayonBibliothecaire;
}
