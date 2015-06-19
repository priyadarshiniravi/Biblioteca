package com.twu.biblioteca;

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

    public void addMovie(String name, int year, String director, int rating,User user) {
        formattedMovies+=name+ ",";
        formattedMovies+=year+ ",";
        formattedMovies+=director+",";
        formattedMovies+=rating+",";
        formattedMovies+=user;
        formattedMovies+="\n";
    }


}
