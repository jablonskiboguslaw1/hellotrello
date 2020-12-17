package pl.bogus.demo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.bogus.demo.database.TaskRepository;
import pl.bogus.demo.dto.TaskDto;
import pl.bogus.demo.model.Progress;
import pl.bogus.demo.model.Task;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TaskService {


    private final TaskRepository taskRepository;


    public Task findById(Long taskId) {
        return taskRepository.findById(taskId).orElseThrow(NoSuchElementException::new);
    }
    @Transactional
    public Task createTask(Long projectId, TaskDto taskDto) {

        return Task.builder().title(taskDto.getTitle())
                .notes(taskDto.getNotes())
                .points(taskDto.getPoints())
                .priority(taskDto.getPriority())
                .deleted(false)
                .progress(Progress.BACKLOG)
                .build();
    }
    @Transactional
    public boolean changeTaskProgress(Long taskId, String progress) {
        Task taskById = findById(taskId);
        taskById.setProgress(Progress.valueOf(progress.toUpperCase()));
        return true;
    }
    @Transactional
    public boolean deleteTask(Long taskId) {
        Task taskById = findById(taskId);
        taskById.setDeleted(true);
        return true;

    }
    @Transactional
    public Task editTask(Long taskId, TaskDto taskDto) {
        Task taskById = findById(taskId);
       taskById.setNotes(taskDto.getNotes());
       taskById.setPoints(taskDto.getPoints());
       taskById.setPriority(taskDto.getPriority());
       taskById.setTitle(taskDto.getTitle());
       return taskById;
    }


}



