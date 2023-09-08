package tn.spring.examxrev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class tes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
