package pl.bogus.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@Setter
@Getter
@Entity
public class ProjectContribution {



    public ProjectContribution(Long ownerId, Long projectID){
        this.contributorID=ownerId;
        this.projectID = projectID;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    private Long contributorID;
    private Long projectID;
}
