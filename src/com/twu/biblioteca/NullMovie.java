package com.twu.biblioteca;

public class NullMovie extends Movie {

    public NullMovie(String name, int year, String director, int rating) {
        super(name, year, director, rating);
    }

    @Override
    public Movie returnMovie(User user) {
        return createNullMovie();
    }

    public static NullMovie createNullMovie() {

        return new NullMovie(null, 0, null, 0);
    }

    @Override
    public Movie checkoutMovie(User user) {
        return createNullMovie();
    }

    @Override
    public String checkoutMessage() {
        return Messages.UNSUCCESS_CHECKOUT_MOVIE;
    }

    @Override
    public String returnMessage() {
        return Messages.UNSUCCESSFUL_RETURN_MOVIE;
    }

    @Override
    public void appendToAvailableMovies(MoviesPresenter moviesPresenter) {

    }

    @Override
    public void appendToCheckoutMovies(MoviesPresenter moviesPresenter) {

    }
}