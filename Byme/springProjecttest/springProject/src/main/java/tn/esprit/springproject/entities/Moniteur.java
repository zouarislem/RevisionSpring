package tn.esprit.springproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;

    private String nomM;
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private Date dareRecu;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> cours;


}
