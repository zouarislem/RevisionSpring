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
public class FamilleActe implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 long idFA;
 String codeFA;
 String libelle;
 String description;


@OneToMany(mappedBy = "familleActe", cascade = CascadeType.ALL)
     List<Acte> actes;


}

