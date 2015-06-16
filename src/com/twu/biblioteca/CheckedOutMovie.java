package com.twu.biblioteca;

import static com.twu.biblioteca.Messages.SUCCESS_CHECKOUT;

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
    public String checkoutMessage()
    {
        return SUCCESS_CHECKOUT;
    }

}