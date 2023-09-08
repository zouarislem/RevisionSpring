package tn.spring.examxrev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.examxrev.entities.Project;
import tn.spring.examxrev.entities.Role;
import tn.spring.examxrev.entities.Sprint;
import tn.spring.examxrev.entities.User;
import tn.spring.examxrev.repositories.ProjectRepository;
import tn.spring.examxrev.repositories.SprintRepository;
import tn.spring.examxrev.repositories.UserRepository;

import java.util.List;
import java.util.Set;

@Service
public class Services implements IServices{
@Autowired
    UserRepository userRepository;
  @Autowired
  SprintRepository sprintRepository;
  @Autowired
    ProjectRepository projectRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Project addProject(Project project) {
        List<Sprint> sprints = project.getSprints();
        for (Sprint sprint: sprints) { sprint.setProject(project); }
        return projectRepository.save(project);
    }

    @Override
    public void assignProjectToScrumMaster(int projectId, String fName, String lName) {
        Project proj = projectRepository.findById(projectId).orElse(null);
        User user = userRepository.retrieveScrumMasterByNameEtPrenom(fName, lName);
        user.getProjects1().add(proj);
        userRepository.save(user);
    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String lName) {
       User scrumaster=  userRepository.findByfNameAndINameAndRole(fName,lName, Role.SCRUM_MASTER);

        return scrumaster.getProjects1();
    }


}
