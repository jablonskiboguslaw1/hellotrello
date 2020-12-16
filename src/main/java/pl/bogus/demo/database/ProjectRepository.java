package pl.bogus.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bogus.demo.model.Project;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}
