package tn.esprit.spring.testspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Musee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long museeId;
    @Temporal(TemporalType.DATE)
    private Date dateInauguration;
    private String designation;
    private String adresse;

    @OneToMany(mappedBy = "musee")
    @JsonIgnore
    private Set<Zone> zones;
}
