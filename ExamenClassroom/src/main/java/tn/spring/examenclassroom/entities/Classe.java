package tn.spring.examenclassroom.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int codeClasse;
    public String title;
    @Enumerated(EnumType.STRING)
    public Niveau niveau;

@OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
@JsonIgnore
    public List<CoursClassroom> coursClassrooms;

}
