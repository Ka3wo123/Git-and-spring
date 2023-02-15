package pl.kajtek.springbootdockergit.dao;

import org.springframework.stereotype.Repository;
import pl.kajtek.springbootdockergit.model.Movie;

import java.util.List;
import java.util.Optional;

@Repository("postgresDB")
public class MovieDataAccessService implements MovieDAO {
    @Override
    public int insertMovie(Movie movie) {
        return 0;
    }

    @Override
    public int deleteMovieById(Long id) {
        return 0;
    }

    @Override
    public int updateMovieById(Long id, Movie alteredMovie) {
        return 0;
    }

    @Override
    public Optional<Movie> selectMovieById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Movie> select20FirstMovies() {
        return null;
    }
}
