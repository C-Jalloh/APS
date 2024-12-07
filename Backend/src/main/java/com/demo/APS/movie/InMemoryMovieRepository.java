package com.demo.APS.movie;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryMovieRepository implements MovieRepository {

    private static final Logger log = LoggerFactory.getLogger(InMemoryMovieRepository.class);
    private final List<Movie> movies = new ArrayList<>();

    public List<Movie> findAll() {
        return new ArrayList<>(movies);
    }

    public Optional<Movie> findById(Integer id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }

    public void create(Movie movie) {
        movies.add(new Movie(
                movie.getId(),
                movie.getTitle(),
                movie.getMovieDescription(),
                movie.getQuality(),
                movie.getGenre(),
                movie.getDuration(),
                movie.getReleaseDate(),
                movie.getPoster(),
                0,
                movie.getUserIds(),
                0
        ));
    }

    public void update(Movie newMovie, Integer id) {
        Optional<Movie> existingMovie = findById(id);
        if (existingMovie.isPresent()) {
            int index = movies.indexOf(existingMovie.get());
            movies.set(index, newMovie);
            log.info("Updated movie with id {}", id);
        } else {
            log.warn("Movie with id {} not found for update.", id);
        }
    }

    public void delete(Integer id) {
        log.info("Deleting movie: {}", id);
        movies.removeIf(movie -> movie.getId().equals(id));
    }

    public int count() {
        return movies.size();
    }

    public void saveAll(List<Movie> movies) {
        movies.forEach(this::create);
    }

    @PostConstruct
    private void init() {
        movies.add(new Movie(
                1,
                "Avengers Endgame",
                "After a decade of epic stories, come and witness the final one",
                Quality.HD,
                Genre.ACTION,
                "2hrs 30mins",
                "July 2019",
                "front/APS/src/assets/running1.png",
                0,
                "1",
                1
        ));

        movies.add(new Movie(
                2,
                "Dragon Ball Super",
                "Seven years after the events of Dragon Ball Z, Earth is at peace...",
                Quality.HD,
                Genre.ANIME,
                "23mins",
                "July 5, 2015",
                "front/APS/src/assets/DragonBallSuper.png",
                0,
                "1",
                1
        ));
    }
}