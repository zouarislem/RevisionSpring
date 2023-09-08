package tn.esprit.spring.testspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idZone;
    private String code;
    private String libelle;
    private boolean actif;
    @Enumerated(EnumType.STRING)
    private Direction direction;

    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Personnel directeur;
    @OneToMany(mappedBy = "zones")
    @JsonIgnore
    private Set<Personnel> gardiens;

    @ManyToOne
    @JsonIgnore
    private Musee musee;

    @OneToMany(mappedBy = "zone")
    @JsonIgnore
    private Set<OeuvreArt> oeuvreArts;
}
