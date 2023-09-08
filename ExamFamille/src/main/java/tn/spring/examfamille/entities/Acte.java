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
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idActe;
     String codeActe;
      int cotationActe;
     float prixUnitaireActe;
     String designationActe;

    @ManyToOne(cascade = CascadeType.ALL)
      FamilleActe familleActe;

    @ManyToMany(mappedBy = "actes")
     List<Pathologie> pathologies;
}
