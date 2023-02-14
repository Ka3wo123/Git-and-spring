package pl.kajtek.springbootdockergit.dao;

import pl.kajtek.springbootdockergit.model.Movie;

import java.util.List;
import java.util.Optional;


public interface MovieDAO {

    int insertMovie(Movie movie);

    int deleteMovieById(Long id);

    int updateMovieById(Long id, Movie alteredMovie);

    Optional<Movie> selectMovieById(Long id);

    List<Movie> select20FirstMovies();


}
