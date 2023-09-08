package tn.esprit.examenblanc.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idActe;
    String codeActe;
    long cotationActe;
    float prixUnitaireActe;
   String typeCotation;
   String designationActe;
   Boolean actif;
   @ManyToMany(mappedBy = "actes")
   @JsonIgnore
   Set<Pathologie> pathologies=new HashSet<Pathologie>();
   @ManyToOne(cascade = CascadeType.ALL)
   FamilleActe fActe;
}
