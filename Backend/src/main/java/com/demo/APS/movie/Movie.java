package com.demo.APS.movie;

import jakarta.validation.constraints.NotEmpty;

public record Movie(
        Integer id,
        @NotEmpty String title,
        String movieDescription,
        Quality quality,
        Genre genre,
        String duration,
        String releaseDate,
        String poster,
        Integer avrRating,
        String userIds,
        Integer viewCount) {

    public Movie() {
        this(0,
            "",
            "",
            Quality.HD,
            Genre.ACTION,
            "", 
            "",
            "/", 
            0, 
            "", 
            1);
    }


    public String getDuration() {
        return duration;
    }

}
