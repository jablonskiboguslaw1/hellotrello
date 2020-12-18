package pl.bogus.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String title;
    private String notes;
    private int points;
    private int priority;

    @Enumerated(EnumType.STRING)
    private Progress progress;
    private boolean deleted;

}
