package com.example.b.entities;

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
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon;
    private String codeRayon;
    private String nomRayon;
    @ManyToOne
    @JsonIgnore
    private Bibliotheque bibliotheque;
    @OneToMany(mappedBy = "rayon")
    @JsonIgnore
    List<Livre> livres;
    @OneToOne
    @JsonIgnore
    Personnel responsable;
    @OneToMany(mappedBy ="rayonBibliothecaire")
    @JsonIgnore
    List<Personnel> bibliothecaires;

}
