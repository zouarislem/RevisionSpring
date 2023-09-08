package tn.esprit.newexam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.newexam.entities.Client;
@Repository
public interface ClientsRepo extends JpaRepository<Client, Long> {
}
