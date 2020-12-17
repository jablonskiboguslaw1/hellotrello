package pl.bogus.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.bogus.demo.database.ProjectContributionRepository;
import pl.bogus.demo.database.ProjectRepository;
import pl.bogus.demo.model.Project;
import pl.bogus.demo.model.ProjectContribution;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class ProjectService {

private final ProjectRepository projectRepository;
private final ProjectContributionRepository projectContributionRepository;



public Project  createNewProject(Long ownerId, String name, String description){

    Project createdProject =
            new Project();
            createdProject.setOwnerId(ownerId);
            createdProject.setName(name);
            createdProject.setDescription(description);
            createdProject.setTasks(new ArrayList<>());

    projectRepository.save(createdProject);


    projectContributionRepository.save(new ProjectContribution(ownerId, createdProject.getId()));
    return createdProject;
}

}
