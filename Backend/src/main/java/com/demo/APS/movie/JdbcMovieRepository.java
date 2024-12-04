package com.demo.APS.movie;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Repository("jdbcmovieRepository")
public class JdbcMovieRepository implements MovieRepository {

    private final JdbcClient jdbcClient;

    public JdbcMovieRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Movie> findAll() {
        return jdbcClient.sql("select * from movie")
                .query(Movie.class)
                .list();
    }

    public Optional<Movie> findById(Integer id) {
        return jdbcClient.sql("SELECT id,title,movieDescription,quality,genre,duration,releaseDate,poster,avrRating,userIds,viewCount FROM Movie WHERE id = :id" )
                .param("id", id)
                .query(Movie.class)
                .optional();
    }

    public void create(Movie movie) {
        var updated = jdbcClient.sql("INSERT INTO Movie(id,title,movieDescription,quality,genre,duration,releaseDate,poster,avrRating,userIds,viewCount) values(?,?,?,?,?,?,?,?,?,?,?)")
                .params(List.of(movie.id(),movie.title(),movie.movieDescription(),movie.quality(),movie.genre(),movie.duration(),movie.releaseDate(),movie.poster(),movie.avrRating(),movie.userIds(),movie.viewCount().toString()))
                .update();

        Assert.state(updated == 1, "Failed to create movie " + movie.title());
    }

    public void update(Movie movie, Integer id) {
        var updated = jdbcClient.sql("update movie set title = ? where id = ?")
                .params(List.of(movie.title().toString(), id))
                .update();

        Assert.state(updated == 1, "Failed to update movie " + movie.title());
    }

    public void delete(Integer id) {
        var updated = jdbcClient.sql("delete from movie where id = :id")
                .param("id", id)
                .update();

        Assert.state(updated == 1, "Failed to delete movie " + id);
    }

    public int count() {
        return jdbcClient.sql("select * from movie").query().listOfRows().size();
    }

    public void saveAll(List<Movie> movies) {
        movies.stream().forEach(this::create);
    }



}
