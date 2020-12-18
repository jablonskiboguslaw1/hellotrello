package pl.bogus.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.bogus.demo.dto.TaskDto;
import pl.bogus.demo.model.Task;
import pl.bogus.demo.service.TaskService;

import java.util.List;

@RestController("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public Task getSingleTask(@RequestParam Long taskId) {
        return taskService.findById(taskId);
    }

    @GetMapping("/projectId")
    public List<Task> getTasksFromProject(Long projectId) {
        return taskService.getAllByProjectId(projectId);
    }

    @PostMapping
    public Task createTask(@RequestBody TaskDto taskDto, Long projectId) {
        return taskService.createTask(projectId, taskDto);
    }

    @DeleteMapping
    public boolean deleteTask(Long taskId) {
        return taskService.deleteTask(taskId);
    }

    @PutMapping
    public Task editTask(@RequestBody TaskDto taskDto, Long taskId) {
        return taskService.editTask(taskId, taskDto);
    }

}
