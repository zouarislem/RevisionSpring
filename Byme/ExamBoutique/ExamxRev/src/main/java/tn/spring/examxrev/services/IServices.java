package tn.spring.examxrev.services;

import tn.spring.examxrev.entities.Project;
import tn.spring.examxrev.entities.User;

import java.util.List;

public interface IServices {

    public User addUser (User user);

    public Project addProject (Project project);

    public void assignProjectToScrumMaster(int projectId, String fName, String lName);

    public List<Project> getProjectsByScrumMaster(String fName, String lName);
}
