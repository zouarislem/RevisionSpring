package com.example.b.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bibliotheque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBibliotheque;
    private String nomBibliotheque;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @OneToMany(mappedBy = "bibliotheque")
    List<Rayon> rayons;
}
