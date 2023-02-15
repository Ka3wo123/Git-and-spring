package pl.kajtek.springbootdockergit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Production {
    private Long id;
    private String prodCountry;

    public Production(@JsonProperty Long id,
                      @JsonProperty String prodCountry) {
        this.id = id;
        this.prodCountry = prodCountry;
    }
}
