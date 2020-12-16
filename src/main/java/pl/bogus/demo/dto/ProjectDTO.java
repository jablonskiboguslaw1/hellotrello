package pl.bogus.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class ProjectDTO {

    private Long ownerId;
    private String name;
    private String description;
}
