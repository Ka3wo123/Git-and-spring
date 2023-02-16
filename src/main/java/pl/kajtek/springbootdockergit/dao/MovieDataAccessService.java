package pl.kajtek.springbootdockergit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import pl.kajtek.springbootdockergit.model.Movie;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository("postgresDB")
public class MovieDataAccessService implements MovieDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MovieDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertMovie(Movie movie) {
        final String sql = """
                INSERT INTO movies (title, release_date, stars, genre_id, production_id, director_id)
                VALUES (?, ?, ?, ?, ?, ?)
                """;
        return jdbcTemplate.update(sql,
                movie.getTitle(),
                movie.getReleaseDate(),
                movie.getStars(),
                movie.getGenreFK(),
                movie.getProductionFK(),
                movie.getProductionFK());

    }

    @Override
    public int deleteMovieById(Long id) {
        final String sql = """
                DELETE FROM movies WHERE id = ?
                """;
        return jdbcTemplate.update(sql, id);
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
        final String sql = """
                SELECT id, title, release_date, stars, genre_id, production_id, director_id
                FROM movies
                LIMIT 20
                """;
        return jdbcTemplate.query(sql, (resultSet, i) -> new Movie(
                Long.parseLong(resultSet.getString("id")),
                resultSet.getString("title"),
                Date.valueOf(resultSet.getString("release_date")),
                Integer.parseInt(resultSet.getString("stars")),
                Integer.parseInt(resultSet.getString("genre_id")),
                Integer.parseInt(resultSet.getString("production_id")),
                Integer.parseInt(resultSet.getString("director_id"))
                )
        );
    }
}
