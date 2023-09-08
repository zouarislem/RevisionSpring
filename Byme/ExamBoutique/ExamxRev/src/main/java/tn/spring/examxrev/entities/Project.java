package tn.spring.examxrev.entities;

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
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;

    @OneToMany(mappedBy ="project" , cascade = CascadeType.ALL,fetch = FetchType.EAGER)
     List<Sprint> sprints;

    @ManyToMany(mappedBy = "projects")
     List<User> users;


}
