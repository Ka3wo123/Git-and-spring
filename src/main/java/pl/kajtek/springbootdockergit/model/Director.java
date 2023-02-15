package pl.kajtek.springbootdockergit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Director {
    private Long id;
    private String name;
    private String surname;
    private Long otherMoviesFK;

    public Director(@JsonProperty Long id,
                    @JsonProperty String name,
                    @JsonProperty String surname,
                    @JsonProperty Long otherMoviesFK) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.otherMoviesFK = otherMoviesFK;
    }
}
