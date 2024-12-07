package com.demo.APS.movie;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Repository("jdbcMovieRepository")
public class JdbcMovieRepository implements MovieRepository {

    private final JdbcClient jdbcClient;

    public JdbcMovieRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Movie> findAll() {
        return jdbcClient.sql("SELECT * FROM movie")
                .query(Movie.class)
                .list();
    }

    public Optional<Movie> findById(Integer id) {
        return jdbcClient.sql("SELECT * FROM movie WHERE id = ?")
                .param(id)
                .query(Movie.class)
                .optional();
    }

    public void create(Movie movie) {
        int updated = jdbcClient.sql(
                        "INSERT INTO movie (id, title, movieDescription, quality, genre, duration, releaseDate, poster, avrRating, userIds, viewCount) " +
                                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
                .params(
                        movie.getId(),
                        movie.getTitle(),
                        movie.getMovieDescription(),
                        movie.getQuality().name(),
                        movie.getGenre().name(),
                        movie.getDuration(),
                        movie.getReleaseDate(),
                        movie.getPoster(),
                        movie.getAvrRating(),
                        movie.getUserIds(),
                        movie.getViewCount()
                )
                .update();

        Assert.state(updated == 1, "Failed to create movie " + movie.getTitle());
    }

    public void update(Movie movie, Integer id) {
        int updated = jdbcClient.sql(
                        "UPDATE movie SET title = ?, movieDescription = ?, quality = ?, genre = ?, duration = ?, releaseDate = ?, poster = ?, avrRating = ?, userIds = ?, viewCount = ? WHERE id = ?")
                .params(
                        movie.getTitle(),
                        movie.getMovieDescription(),
                        movie.getQuality().name(),
                        movie.getGenre().name(),
                        movie.getDuration(),
                        movie.getReleaseDate(),
                        movie.getPoster(),
                        movie.getAvrRating(),
                        movie.getUserIds(),
                        movie.getViewCount(),
                        id
                )
                .update();

        Assert.state(updated == 1, "Failed to update movie " + movie.getTitle());
    }

    public void delete(Integer id) {
        int updated = jdbcClient.sql("DELETE FROM movie WHERE id = ?")
                .param(id)
                .update();

        Assert.state(updated == 1, "Failed to delete movie with id " + id);
    }

    public int count() {
        return jdbcClient.sql("SELECT COUNT(*) FROM movie")
                .query(Integer.class)
                .single();
    }

    public void saveAll(List<Movie> movies) {
        movies.forEach(this::create);
    }
}