package pl.bogus.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bogus.demo.dto.ProjectDTO;
import pl.bogus.demo.model.Project;
import pl.bogus.demo.service.ProjectService;

@RestController("/project")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;


    @PostMapping("/new")
    public Project createProject(@RequestBody  ProjectDTO projectDTO){
        return  projectService.createNewProject(
                projectDTO.getOwnerId()
                , projectDTO.getName()
                , projectDTO.getDescription());
    }


    /*
    TODO
     @PutMapping("close")
  public boolean closeProject(){
        return false;
}*/
}
