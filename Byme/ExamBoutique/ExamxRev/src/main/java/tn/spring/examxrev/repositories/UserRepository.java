package tn.spring.examxrev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.examxrev.entities.Role;
import tn.spring.examxrev.entities.User;
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.fName=?1 And u.IName=?2")
    User retrieveScrumMasterByNameEtPrenom(String fName, String lName);

        User findByfNameAndINameAndRole (String fName , String lName, Role  role);

}
