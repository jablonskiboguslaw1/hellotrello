package pl.bogus.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bogus.demo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
