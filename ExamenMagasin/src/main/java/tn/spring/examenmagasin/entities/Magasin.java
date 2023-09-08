package tn.spring.examenmagasin.entities;

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
public class Magasin implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idMagasin;
    public String nomMagasin;
    public String adresse;

    @ManyToOne
    public Entreprise entreprise;

    @OneToOne
    public Employe employe;

    @OneToMany(mappedBy = "magasin1")
    public List<Employe> employes;
}

