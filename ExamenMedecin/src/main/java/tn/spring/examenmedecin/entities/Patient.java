package tn.spring.examenmedecin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor

@AllArgsConstructor

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPatient;
    String nomPatient;
    int telephone;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;

    @OneToMany(mappedBy = "patient")
    public List<RendezVous> rendezVous;
}
