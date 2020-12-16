package pl.bogus.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bogus.demo.model.ProjectContribution;

public interface ProjectContributionRepository extends JpaRepository<ProjectContribution, Long> {

}
