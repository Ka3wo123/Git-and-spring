package pl.kajtek.springbootdockergit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Date;

@Getter
public class Movie {

    private Long id;
    private String title;
    private Date releaseDate;
    private Integer stars;
    private Integer genreFK;
    private Integer productionFK;
    private Integer directorFK;

    public Movie(@JsonProperty("id") Long id,
                 @JsonProperty("title") String title,
                 @JsonProperty("release_date") Date releaseDate,
                 @JsonProperty("stars") Integer stars,
                 @JsonProperty("genre_fk") Integer genreFK,
                 @JsonProperty("production_fk") Integer productionFK,
                 @JsonProperty("director_fk") Integer directorFK) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.stars = stars;
        this.genreFK = genreFK;
        this.productionFK = productionFK;
        this.directorFK = directorFK;
    }
}
