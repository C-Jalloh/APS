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
        return movies;
    }

    public Optional<Movie> findById(Integer id) {
        return Optional.ofNullable(movies.stream()
                .filter(movie -> movie.id() == id)
                .findFirst()
                .orElseThrow(MovieNotFoundException::new));
    }

    public void create(Movie movie) {
        Movie newMovie = new Movie(movie.id(),
                movie.title(),
                movie.movieDescription(),
                movie.quality(),
                movie.genre(),
                movie.duration(),
                movie.releaseDate(),
                movie.poster(),
                0,
                movie.userIds(),
                0);

        movies.add(newMovie);
    }

    public void update(Movie newmovie, Integer id) {
        Optional<Movie> existingmovie = findById(id);
        if (existingmovie.isPresent()) {
            var r = existingmovie.get();
            log.info("Updating Existing movie: " + existingmovie.get());
            movies.set(movies.indexOf(r), newmovie);
        }
    }

    public void delete(Integer id) {
        log.info("Deleting movie: " + id);
        movies.removeIf(movie -> movie.id().equals(id));
    }

    public int count() {
        return movies.size();
    }

    public void saveAll(List<Movie> movies) {
        movies.stream().forEach(movie -> create(movie));
    }

    @PostConstruct
    private void init() {
        movies.add(new Movie(
                1,
                "Avengers EndGame",
                "After a decade of bullshit come and witness the final one",
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
                "Seven years after the events of Dragon Ball Z, Earth is at peace, and its people live free from any dangers lurking in the universe. However, this peace is short-lived; a sleeping evil awakens in the dark reaches of the galaxy: Beerus, the ruthless God of Destruction. Disturbed by a prophecy that he will be defeated by a \"Super Saiyan God,\" Beerus and his angelic attendant Whis start searching the universe for this mysterious being. Before long, they reach Earth where they encounter SON-Goku, one of the planet's mightiest warriors, and his similarly powerful friends.",
                Quality.HD,
                Genre.ANIME,
                "23mins",
                "July 5, 2015",
                "front/APS/src/assets/Dragon Ball Super.png",
                0, 
                "1",
                1
            
            ));
    }

}
