package tn.spring.examenmagasin.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idEmploye;
    public String prenom;
    public String nom;
    public Long identifiant;
    @Temporal(TemporalType.DATE)
    public Date dateFinContrat;
    @Enumerated(EnumType.STRING)
    public Categorie categorie;

    @ManyToMany
    public List<Rayon> rayons;

    @OneToOne(mappedBy = "employe")
    public Magasin chefrayon;

    @ManyToOne
    public Magasin magasin1;

}
