package tn.spring.examenclassroom.entities;

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
public class CoursClassroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idCours;
    @Enumerated(EnumType.STRING)
    public Specialite specialite;
    public String nom;
    public int nbHeures;
    public Boolean archive;
    @ManyToOne
    public Classe classe;
}
