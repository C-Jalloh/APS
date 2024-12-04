package com.demo.APS.movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {

    List<Movie> findAll();

    Optional<Movie> findById(Integer id);

    void create(Movie movie);

    void update(Movie movie, Integer id);

    void delete(Integer id);

    int count();

    void saveAll(List<Movie> movies);

}
