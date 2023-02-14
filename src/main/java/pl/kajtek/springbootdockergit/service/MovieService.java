package pl.kajtek.springbootdockergit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.kajtek.springbootdockergit.dao.MovieDAO;
import pl.kajtek.springbootdockergit.model.Movie;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieDAO movieDAO;

    @Autowired
    public MovieService(@Qualifier("postgresDB") MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    public int insertMovie(Movie movie) {
        return movieDAO.insertMovie(movie);
    }

    public int deleteMovieByID(Long id) {
        return movieDAO.deleteMovieById(id);
    }

    public int updateMovieByID(Long id, Movie alteredMovie) {
        return movieDAO.updateMovieById(id, alteredMovie);
    }

    public Optional<Movie> selectMovieByID(Long id) {
        return movieDAO.selectMovieById(id);
    }

    public List<Movie> selectMovies() {
        return movieDAO.select20FirstMovies();
    }
}
