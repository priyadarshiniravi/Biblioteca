package com.twu.biblioteca;

public class CheckedOutMovie extends Movie {
    User user;
    public CheckedOutMovie(String name, int year, String director, int rating,User user) {
        super(name, year, director, rating);
        this.user=user;
    }


    public static CheckedOutMovie createCheckoutMovie(AvailableMovie availableMovie,User user) {

        return new CheckedOutMovie(availableMovie.name, availableMovie.year, availableMovie.director, availableMovie.rating,user);
    }


    @Override
    public Movie returnMovie(User user) {
        return AvailableMovie.createAvailableMovie(this);
    }

    @Override
    public NullMovie checkoutMovie(User user) {
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

    @Override
    public void appendToCheckoutMovies(MoviesPresenter moviesPresenter) {
        moviesPresenter.addMovie(name, year, director, rating,this.user);
    }

}