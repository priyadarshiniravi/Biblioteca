package com.twu.biblioteca;

public abstract class Movie {
    protected String name;
    protected int year;
    protected String director;
    protected int rating;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Movie movie = (Movie) o;

        return !(name != null ? !name.equals(movie.name) : movie.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public boolean isTitleMatch(String name) {
        if (this.name == null) {
            return false;
        }
        return this.name.equals(name);
    }

    public abstract Movie returnMovie(User user);

    public abstract Movie checkoutMovie(User user);

    public abstract String checkoutMessage();

    public abstract String returnMessage();

    public abstract void appendToAvailableMovies(MoviesPresenter moviesPresenter);

    public abstract void appendToCheckoutMovies(MoviesPresenter moviesPresenter);
}
