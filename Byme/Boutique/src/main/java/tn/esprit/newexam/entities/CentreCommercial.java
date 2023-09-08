package tn.esprit.newexam.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CentreCommercial implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public  long id;
    public String nom;
    public String adresse;
    public String login;
    public String password;

    @OneToMany(mappedBy = "centreCommercial")
    public List<Boutique> boutiques ;
}
