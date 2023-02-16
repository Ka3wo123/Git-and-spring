package pl.kajtek.springbootdockergit.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genres")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            nullable = false,
            updatable = false,
            columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "genre",
            nullable = false,
            columnDefinition = "TEXT")
    private String genre;

}
