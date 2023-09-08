package tn.spring.examenmedecin.entities;

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
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idRDV;
    @Temporal(TemporalType.DATE)
    Date dateRDV;
    String remarque;

    @ManyToOne
    public Medecin medecin;

    @ManyToOne
    public Patient patient;
}
