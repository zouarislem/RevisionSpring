package tn.spring.examxrev.entities;

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
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String email;
    private String fName;
    private  String IName;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String pwd;


    @ManyToMany
     List<Project> projects;

    @OneToMany
     List<Project> projects1;

}
