package tn.esprit.newexam.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personnel implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idPersonnel;
public String nom;
public String prenom;
@Temporal(TemporalType.DATE)
public Date dateDerniereAffectation;
@Enumerated(EnumType.STRING)
public TypePersonnel typePersonnel;

@OneToOne(mappedBy = "directeur")
    public Zone zone;

@ManyToOne
    public Zone zone1;
}
