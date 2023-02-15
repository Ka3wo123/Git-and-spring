package pl.kajtek.springbootdockergit.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.kajtek.springbootdockergit.MovieNotFoundException;
import pl.kajtek.springbootdockergit.model.Movie;
import pl.kajtek.springbootdockergit.service.MovieService;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/movie")
@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies() {
        return movieService.selectMovies();
    }

    @GetMapping("{id}")
    public Optional<Movie> getMovieByID(@RequestParam("id") Long id) throws MovieNotFoundException {
        return Optional.of(movieService.selectMovieByID(id).orElseThrow(() -> new MovieNotFoundException("No such movie in list")));
    }

    @PostMapping
    public void addMovie(@RequestBody Movie movie) {
        movieService.insertMovie(movie);
    }

    @DeleteMapping("{id}")
    public void deleteMovieByID(@RequestParam Long id) {
        movieService.deleteMovieByID(id);
    }

    @PutMapping("{id}")
    public void updateMovieByID(@RequestParam Long id, @RequestBody Movie alteredMovie) {
        movieService.updateMovieByID(id, alteredMovie);
    }
}
