package tn.spring.examenmedecin.entities;

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
public class Clinique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   public long idClinique;
    public String nomClinique;
    public String adresse;
   public  int telephone;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Medecin> medecins;
}
