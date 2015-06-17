package com.twu.biblioteca;

import com.twu.biblioteca.Movie;

public class NullMovie extends Movie {

    public NullMovie(String name, int year, String director, int rating) {
        super(name, year, director, rating);
    }

    @Override
    public Movie returnMovie() {
        return null;
    }

    public static NullMovie createNullMovie() {

        return new NullMovie(null,0, null, 0);
    }
    @Override
    public Movie checkoutMovie() {
        return null;
    }

    @Override
    public String checkoutMessage() {
        return null;
    }

    @Override
    public String returnMessage() {
        return null;
    }
}