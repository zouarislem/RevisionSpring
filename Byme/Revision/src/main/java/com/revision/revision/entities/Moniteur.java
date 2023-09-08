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

public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long numMoniteur;
    public String nomM;
    public String prenomM;

    public LocalDate dateRecru;

    @OneToMany
    public List<Cours> cours;
}
