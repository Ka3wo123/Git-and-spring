package pl.kajtek.springbootdockergit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Genre {

    private Long id;
    private String genre;

    public Genre(@JsonProperty Long id,
                 @JsonProperty String genre) {
        this.id = id;
        this.genre = genre;
    }
}
