package pl.bogus.demo.model;

import javax.persistence.*;

@Entity
public class ProjectContribution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;
    private Long contributorID;
    private Long projectID;
}
