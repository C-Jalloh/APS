package com.demo.APS.movie;

import jakarta.validation.constraints.NotEmpty;

public class Movie {

    private Integer id;
    @NotEmpty
    private String title;
    private String movieDescription;
    private Quality quality;
    private Genre genre;
    private String duration;
    private String releaseDate;
    private String poster;
    private Integer avrRating;
    private String userIds;
    private Integer viewCount;

    public Movie() {
        this(0, "", "", Quality.HD, Genre.ACTION, "", "", "/", 0, "", 1);
    }

    public Movie(Integer id, String title, String movieDescription, Quality quality, Genre genre,
                 String duration, String releaseDate, String poster, Integer avrRating,
                 String userIds, Integer viewCount) {
        this.id = id;
        this.title = title;
        this.movieDescription = movieDescription;
        this.quality = quality;
        this.genre = genre;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.poster = poster;
        this.avrRating = avrRating;
        this.userIds = userIds;
        this.viewCount = viewCount;
    }

    // Getters and setters for all fields

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and setter for 'title'
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and setter for 'movieDescription'
    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    // Getter and setter for 'quality'
    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    // Getter and setter for 'genre'
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // Getter and setter for 'duration'
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    // Getter and setter for 'releaseDate'
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    // Getter and setter for 'poster'
    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    // Getter and setter for 'avrRating'
    public Integer getAvrRating() {
        return avrRating;
    }

    public void setAvrRating(Integer avrRating) {
        this.avrRating = avrRating;
    }

    // Getter and setter for 'userIds'
    public String getUserIds() {
        return userIds;
    }

    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    // Getter and setter for 'viewCount'
    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }
}