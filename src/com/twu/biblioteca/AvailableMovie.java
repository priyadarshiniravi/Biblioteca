package com.twu.biblioteca;

public class AvailableMovie extends Movie {
    public AvailableMovie(String name, int year, String director, int rating) {
        super(name, year, director, rating);
    }

    @Override
    public Movie returnMovie() {
        return null;
    }

    @Override
    public Movie checkoutMovie() {
        return null;
    }

    @Override
    public String checkoutMessage() {
        return null;
    }

    public static AvailableMovie createAvailableMovie(CheckedOutMovie availableMovie) {

        return new AvailableMovie(availableMovie.name, availableMovie.year, availableMovie.director, availableMovie.rating);
    }
}
