package tn.spring.examfamille.entities;

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
public class Pathologie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      long idPath;
      String codePath;
     String libelle;
     String description;
     Boolean archive = false;

    @ManyToMany
     List<Acte> actes;

}
