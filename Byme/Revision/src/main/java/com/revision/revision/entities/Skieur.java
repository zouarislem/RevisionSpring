package com.revision.revision.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numSkieur;
    public String nomS;
    public String prenomS;

    public LocalDate dateNaissance;
    public String ville;

    @OneToOne
    public Abonnement abonnement;

    @ManyToMany
    public List<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    public List<Inscription> inscriptions;
}
