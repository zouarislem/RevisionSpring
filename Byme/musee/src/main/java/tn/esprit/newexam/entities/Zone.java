package tn.esprit.newexam.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Sort;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idZone;
    public String code;
    public String libelle;
    @Enumerated(EnumType.STRING)
    public Direction direction;
    public Boolean actif;

@OneToMany(mappedBy = "zone")
    public List<OeuvreArt> oeuvreArt;

@ManyToOne
    public Musee musee;

@OneToOne
    public Personnel directeur;

@OneToMany(mappedBy = "zone1")
    public List<Personnel> personnels;

}
