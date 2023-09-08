package tn.spring.examxrev.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.examxrev.entities.Project;
import tn.spring.examxrev.entities.User;
import tn.spring.examxrev.services.IServices;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {
    IServices iServices;

    @PostMapping("/addUser")
    public User addUser (@RequestBody User user){
        return iServices.addUser(user);
    }

    @PostMapping("/addProject")
        public Project addProject(@RequestBody Project project){
        return iServices.addProject(project);
    }

@PutMapping("/assignProjectToScrum/{idproj}/{fn}/{ln}")
    public void assignProjectToScrumMaster(@PathVariable("idproj") int projectId,@PathVariable("fn") String fName,@PathVariable("ln") String lName){
            iServices.assignProjectToScrumMaster(projectId, fName, lName);
    }
    @GetMapping("/GetProjectsByMaster/{fn}/{ln}")
    public List<Project> getProjectsByScrumMaster(@PathVariable("fn") String fName,@PathVariable("ln") String lName){
          return   iServices.getProjectsByScrumMaster(fName,lName);
    }
}
