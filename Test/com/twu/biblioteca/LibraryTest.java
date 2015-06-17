package com.twu.biblioteca;

import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;

public class LibraryTest {
    @Test
    public void shouldBeBooksDetailList() {

        AvailableBook firstBook = new AvailableBook("Java", "Jones", 1992);
        AvailableBook secondBook = new AvailableBook("OOPs", "Patric", 1992);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        HashSet<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);
        HashSet<Movie> movies = new HashSet<>();


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        String bookList = library.formattedBookString();

        assertEquals("OOPs                          |Patric                        |1992\n" +
                "Java                          |Jones                         |1992\n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        AvailableBook firstBook = new AvailableBook("Java", "Jones", 1992);
        CheckedOutBook secondBook = new CheckedOutBook("C", "Jones", 1995);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        HashSet<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);
        HashSet<Movie> movies = new HashSet<>();


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        String bookList = library.formattedBookString();

        assertEquals("Java                          |Jones                         |1992\n", bookList);
    }

    @Test
    public void shouldCheckoutIfBookIsNotCheckoutAndAvailable() {
        AvailableBook book = new AvailableBook("C", "Jones", 1995);
        AvailableBook firstBookStub = mock(AvailableBook.class);
        CheckedOutBook secondBookStub = mock(CheckedOutBook.class);
        HashSet<Book> books = new HashSet<>();
        books.add(firstBookStub);
        books.add(secondBookStub);
        books.add(book);
        HashSet<Movie> movies = new HashSet<>();
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Book success = library.checkoutBook("C");

        assertEquals(Messages.SUCCESS_CHECKOUT_BOOK, success.checkoutMessage());
    }

    @Test
    public void shouldNotCheckoutIfBookIsCheckoutAndAvailable() {
        CheckedOutBook book = new CheckedOutBook("C", "Jones", 1995);
        AvailableBook firstBookStub = mock(AvailableBook.class);
        CheckedOutBook secondBookStub = mock(CheckedOutBook.class);
        HashSet<Book> books = new HashSet<>();
        HashSet<Movie> movies = new HashSet<>();
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        books.add(firstBookStub);
        books.add(secondBookStub);
        books.add(book);


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Book success = library.checkoutBook("any");

        assertEquals(Messages.UNSUCCESS_CHECKOUT_BOOK, success.checkoutMessage());
    }

    @Test
    public void shouldReturnIfBookIsCheckout() {
        CheckedOutBook book = new CheckedOutBook("C", "Jones", 1995);
        HashSet<Book> books = new HashSet<>();
        books.add(book);
        HashSet<Movie> movies = new HashSet<>();
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        Library library = new Library(books, movies, booksPresenter, moviesPresenter);
        Book success = library.returnBook("C");

        assertEquals(Messages.SUCCESS_RETURN_BOOK, success.returnMessage());
    }

    @Test
    public void shouldNotReturnIfBookIsNotCheckoutOrNotAvailable() {
        AvailableBook book = new AvailableBook("C", "Jones", 1995);
        AvailableBook firstBookStub = mock(AvailableBook.class);
        CheckedOutBook secondBookStub = mock(CheckedOutBook.class);
        HashSet<Book> books = new HashSet<>();
        books.add(firstBookStub);
        books.add(secondBookStub);
        books.add(book);
        HashSet<Movie> movies = new HashSet<>();
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");
        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Book success = library.returnBook("any");

        assertEquals(Messages.UNSUCCESSFUL_RETURN_BOOK, success.returnMessage());
    }

    @Test
    public void shouldCheckoutIfMovieIsNotCheckoutAndAvailable() {
        AvailableMovie book = new AvailableMovie("C",1883, "Jones", 1);
        AvailableMovie firstMovieStub = mock(AvailableMovie.class);
        CheckedOutMovie secondMovieStub = mock(CheckedOutMovie.class);
        HashSet<Book> books = new HashSet<>();
        HashSet<Movie> movies = new HashSet<>();
        movies.add(firstMovieStub);
        movies.add(secondMovieStub);
        movies.add(book);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Movie success = library.checkoutMovie("C");

        assertEquals(Messages.SUCCESS_CHECKOUT_MOVIE, success.checkoutMessage());
    }

    @Test
    public void shouldNotCheckoutIfMovieIsCheckoutOrNotAvailable() {
        CheckedOutMovie book = new CheckedOutMovie("C",1883, "Jones", 1);
        AvailableMovie firstMovieStub = mock(AvailableMovie.class);
        CheckedOutMovie secondMovieStub = mock(CheckedOutMovie.class);
        HashSet<Book> books = new HashSet<>();
        HashSet<Movie> movies = new HashSet<>();
        movies.add(firstMovieStub);
        movies.add(secondMovieStub);
        movies.add(book);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Movie success = library.checkoutMovie("C");

        assertEquals(Messages.UNSUCCESS_CHECKOUT_MOVIE, success.checkoutMessage());
    }
}