package pl.bogus.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    private Long ownerId;
    private String name;

    private String description;

    @OneToMany
    private List<Task> tasks;


}
