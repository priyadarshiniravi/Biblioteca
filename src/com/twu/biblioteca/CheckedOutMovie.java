package com.twu.biblioteca;

public class CheckedOutMovie extends Movie {

    public CheckedOutMovie(String name, int year, String director, int rating) {
        super(name, year, director, rating);
    }


    public static CheckedOutMovie createCheckoutMovie(AvailableMovie availableMovie) {

        return new CheckedOutMovie(availableMovie.name, availableMovie.year, availableMovie.director, availableMovie.rating);
    }


    @Override
    public Movie returnMovie() {
        return AvailableMovie.createAvailableMovie(this);
    }

    @Override
    public NullMovie checkoutMovie() {
        return NullMovie.createNullMovie();
    }

    @Override
    public String checkoutMessage() {
        return Messages.SUCCESS_CHECKOUT_MOVIE;

    }

    @Override
    public String returnMessage() {
        return null;
    }

    @Override
    public void appendToAvailableMovies(MoviesPresenter moviesPresenter) {

    }

}