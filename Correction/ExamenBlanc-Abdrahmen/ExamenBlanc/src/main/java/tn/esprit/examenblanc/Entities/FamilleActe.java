package tn.esprit.examenblanc.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamilleActe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFamilleActe;
    String codeFamille;
    String libelle;
    String description;
    @OneToMany(mappedBy = "fActe",cascade = CascadeType.ALL)
    Set<Acte> actes=new HashSet<Acte>();
}
