package tn.spring.examenmagasin.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entreprise implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idEntreprise;
    public String nomEntreprise;
    @Temporal(TemporalType.DATE)
    public Date dateCreation;

    @OneToMany(mappedBy = "entreprise")
    public List<Magasin> magasins;
}
