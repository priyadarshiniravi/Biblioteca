package com.twu.biblioteca;

import sun.misc.resources.Messages_es;

import static com.twu.biblioteca.Messages.SUCCESS_RETURN_BOOK;

public class AvailableMovie extends Movie {
    public AvailableMovie(String name, int year, String director, int rating) {
        super(name, year, director, rating);
    }

    @Override
    public Movie returnMovie(User user) {
        return NullMovie.createNullMovie();
    }

    @Override
    public Movie checkoutMovie(User user) {
        return CheckedOutMovie.createCheckoutMovie(this,user);
    }

    @Override
    public String returnMessage() {
        return Messages.SUCCESS_RETURN_MOVIE;
    }

    @Override
    public String checkoutMessage() {
        return null;
    }

    public static AvailableMovie createAvailableMovie(CheckedOutMovie availableMovie) {

        return new AvailableMovie(availableMovie.name, availableMovie.year, availableMovie.director, availableMovie.rating);
    }


    public void appendToAvailableMovies(MoviesPresenter moviesPresenter) {
        moviesPresenter.addMovie(name, year, director, rating,new InvalidUser("","","","",0));
    }

    @Override
    public void appendToCheckoutMovies(MoviesPresenter moviesPresenter) {

    }
}
