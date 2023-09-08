package tn.spring.examenclassroom.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idUtilisateur;
public String prenom;
public String nom;
public String password;


@ManyToOne
    public Classe classe;

}
