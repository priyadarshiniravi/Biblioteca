package com.twu.biblioteca;


import java.util.Set;

public class Library {
    private Set<Book> books;
    private Set<Movie> movies;
    private BooksPresenter booksPresenter;
    private MoviesPresenter moviesPresenter;

    public Library(Set<Book> books, Set<Movie> movies, BooksPresenter booksPresenter, MoviesPresenter moviesPresenter) {
        this.books = books;
        this.movies = movies;
        this.booksPresenter = booksPresenter;
        this.moviesPresenter = moviesPresenter;
    }

    public synchronized Book checkoutBook(String title,User user) {
        Book book = BookSearch(title);
        book = book.checkoutBook(user);
        books.remove(book);
        books.add(book);
        return book;
    }

    public synchronized Movie checkoutMovie(String title) {
        Movie movie = movieSearch(title);
        movie = movie.checkoutMovie();
        movies.remove(movie);
        movies.add(movie);
        return movie;
    }

    public synchronized Movie returnMovie(String title) {
        Movie movie = movieSearch(title);
        movie = movie.returnMovie();
        movies.remove(movie);
        movies.add(movie);
        return movie;
    }


    public synchronized Book returnBook(String title,User user) {
        Book book = BookSearch(title);
        book = book.returnBook(user);
        books.remove(book);
        books.add(book);
        return book;
    }

    public String formattedAvailableBookString() {
        BooksPresenter booksPresenter = new BooksPresenter("");
        for (Book book : books) {

                book.appendAvailableBooks(booksPresenter);

        }
        return booksPresenter.toString();
    }

    public String formattedCheckoutBookString() {
        BooksPresenter booksPresenter = new BooksPresenter("");
        for (Book book : books) {

            book.appendCheckedOutBooks(booksPresenter);

        }
        return booksPresenter.toString();
    }




    public String formattedMovieString() {
        MoviesPresenter moviesPresenter = new MoviesPresenter("");
        for (Movie movie : movies) {
            if (movie instanceof AvailableMovie) {
                movie.appendToMovies(moviesPresenter);
            }
        }
        return moviesPresenter.toString();
    }

    private Movie movieSearch(String title) {
        for (Movie movie : movies) {
            if (movie.isTitleMatch(title))
                return movie;
        }
        return new NullMovie(null, 0, null, 0);
    }


    private Book BookSearch(String title) {
        for (Book book : books) {
            if (book.isTitleMatch(title))
                return book;
        }
        return new NullBook(null, null, 0);
    }


}
