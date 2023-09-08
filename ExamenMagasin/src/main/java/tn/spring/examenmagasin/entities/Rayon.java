package tn.spring.examenmagasin.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idRayon;
    public String codeRayon;
    public String libelleRayon;

    @ManyToMany(mappedBy = "rayons")
    @JsonIgnore
    public List<Employe> employes;
}
