package tn.esprit.newexam.entities;

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
public class OeuvreArt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long idOeuvreArt;
    public String artiste;
    public String titreTableau;

    @ManyToOne
    public Zone zone;
}
