package pl.kajtek.springbootdockergit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            updatable = false,
            nullable = false,
            columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "title",
            nullable = false,
            columnDefinition = "TEXT")
    private String title;

    @Column(name = "release_date",
            nullable = false,
            columnDefinition = "DATE")
    private Date releaseDate;

    @Column(name = "stars",
            nullable = false,
            columnDefinition = "INT")
    private Integer stars;

    @Column(name = "genre_id",
            nullable = false,
            columnDefinition = "INT")
    private Integer genreFK;

    @Column(name = "production_id",
            nullable = false,
            columnDefinition = "INT")
    private Integer productionFK;

    @Column(name = "director_id",
            nullable = false,
            columnDefinition = "INT")
    private Integer directorFK;

    public Movie(String title, Date releaseDate, Integer stars, Integer genreFK, Integer productionFK, Integer directorFK) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.stars = stars;
        this.genreFK = genreFK;
        this.productionFK = productionFK;
        this.directorFK = directorFK;
    }
}
