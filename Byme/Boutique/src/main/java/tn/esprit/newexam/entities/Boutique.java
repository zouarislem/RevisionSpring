package tn.esprit.newexam.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Boutique implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nom;
    @Enumerated(EnumType.STRING)
    public Categorie categorie;

    @ManyToOne
    public CentreCommercial centreCommercial;

    @ManyToMany
    public List<Client> clients;
}
