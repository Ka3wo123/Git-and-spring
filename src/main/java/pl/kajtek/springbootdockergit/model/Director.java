package pl.kajtek.springbootdockergit.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "directors")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            nullable = false,
            updatable = false,
            columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "first_name",
            nullable = false,
            columnDefinition = "TEXT")
    private String name;

    @Column(name = "last_name",
            nullable = false,
            columnDefinition = "TEXT")
    private String surname;

    @Column(name = "movies_id",
            nullable = false,
            columnDefinition = "BIGINT")
    private Long otherMoviesFK;

}
