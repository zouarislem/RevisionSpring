package tn.spring.examfamille.entities;

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
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      long idPatient;
    @Enumerated(EnumType.STRING)
      TypePieceIdentite typePieceIdentite;

     String identifiantPieceIdentite;
      String nomP;
     String prenomP;

    @Temporal(TemporalType.DATE)
     Date dateEmission;

    @ManyToMany
     List<Pathologie> pathologies;
}
