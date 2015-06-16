package com.twu.biblioteca;

public class Movie {
    String name;
    int year;
    String director;
    int rating;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public void appendToMovies(MoviesPresenter moviesPresenter) {
        moviesPresenter.addMovie(name, year, director, rating);
    }
}
