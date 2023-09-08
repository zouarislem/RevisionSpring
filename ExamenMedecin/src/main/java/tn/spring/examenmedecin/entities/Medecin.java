package tn.spring.examenmedecin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idMedecin;
    String nomMedecin;
    @Enumerated(EnumType.STRING)
    Specialite specialite;
    int telephone;
    int prixConsultation;

    @ManyToMany(mappedBy = "medecins")
    @JsonIgnore
    public List<Clinique> cliniques;

    @OneToMany(mappedBy = "medecin")
    public List<RendezVous> rendezVous;
}
