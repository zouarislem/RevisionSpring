package tn.esprit.spring.testspring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personnel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personnelId;
    private String nom;
    private String prenom;
    @Temporal(TemporalType.DATE)
    private Date dateDernierAffectation;
    @Enumerated(EnumType.STRING)
    private TypePersonnel typePersonnel;
    @ManyToOne
    private Zone zones;
    @OneToOne(mappedBy = "directeur", fetch = FetchType.LAZY)
    private Zone zone;
}
