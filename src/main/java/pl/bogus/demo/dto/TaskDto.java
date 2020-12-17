package pl.bogus.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class TaskDto {
    private String title;
    private String notes;
    private int priority;
    private int points;
    private String progress;
}

