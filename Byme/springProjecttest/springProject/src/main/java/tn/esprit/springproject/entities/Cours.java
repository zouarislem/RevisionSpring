package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cours implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numCours;
    private Integer niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;

    private Float prix;
    private Integer creneau;

    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;

}
