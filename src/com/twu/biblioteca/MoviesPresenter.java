package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//
public class MoviesPresenter {
    private String formattedMovies;

    public MoviesPresenter(String formattedMovies) {
        this.formattedMovies = formattedMovies;
    }

    @Override
    public String toString() {
        return formattedMovies;
    }

    public void addMovie(String name, int year, String director, int rating) {
        formattedMovies+=name+ ",";
        formattedMovies+=year+ ",";
        formattedMovies+=director+",";
        formattedMovies+=rating;
        formattedMovies+="\n";
    }
}
