package tn.esprit.newexam.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@Setter
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String nom;
    @Enumerated(EnumType.STRING)
    public Genre genre;

    @ManyToMany(mappedBy = "clients")
    public List<Boutique> boutiques;

}
