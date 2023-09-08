package tn.esprit.newexam.entities;

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
public class Musee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    public Long idMusee;
    @Temporal(TemporalType.DATE)
    public Date DateInauguration;

    public String designation;
    public String adresse;


    @OneToMany(mappedBy = "musee")
    public List<Zone> zones ;
}
