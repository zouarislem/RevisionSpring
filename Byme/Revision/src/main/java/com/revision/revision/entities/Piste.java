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

public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numPiste;
    public String nomPiste;
    @Enumerated(EnumType.STRING)
    public Couleur couleur;
    public int longeur;
    public int pente;
    @ManyToMany(mappedBy = "pistes")
    public List<Skieur> skieurs;
}
