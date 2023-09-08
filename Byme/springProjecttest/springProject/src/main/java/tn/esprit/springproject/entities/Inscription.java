package tn.esprit.springproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Inscription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numInscription;

    private Integer numSemaine;


    @ManyToOne
    @JsonIgnore
    Cours cours;

    @ManyToOne
    @JsonIgnore
    Skieur skieur;
}
