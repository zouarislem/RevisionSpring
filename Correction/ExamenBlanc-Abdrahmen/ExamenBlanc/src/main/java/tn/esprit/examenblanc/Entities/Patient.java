package tn.esprit.examenblanc.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPatient;
    @Enumerated(EnumType.STRING)
    TypePieceIdentite type;
    String identifiantPieceIDentite;
    @Temporal(TemporalType.DATE)
    Date dateEmission;
    String matriculeCNAM;
    String nomP;
    String prenomP;
    @ManyToMany
    Set<Pathologie> pathologies=new HashSet<Pathologie>();
}
