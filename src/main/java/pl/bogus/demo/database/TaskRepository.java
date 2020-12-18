package pl.bogus.demo.database;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bogus.demo.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {



}
