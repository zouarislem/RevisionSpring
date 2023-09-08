package com.revision.revision.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Inscription implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numInscription;
public int numSemaine;

@ManyToOne
    public Skieur skieur;

@ManyToOne
    public Cours cour;

}
