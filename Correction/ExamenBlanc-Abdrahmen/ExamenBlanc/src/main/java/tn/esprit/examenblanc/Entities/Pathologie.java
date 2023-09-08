package tn.esprit.examenblanc.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.SetType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pathologie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPathologie;
    String codePath;
    String libelle;
    String description;
    Boolean archive;
    @ManyToMany
    Set<Acte> actes=new HashSet<Acte>();
}
