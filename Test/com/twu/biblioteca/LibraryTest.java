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

        String bookList = library.formattedAvailableBookString();

        assertEquals("OOPs                          |Patric                        |1992|          \n" +
                "Java                          |Jones                         |1992|          \n", bookList);
    }


    @Test
    public void shouldBeBooksDetailListWhichAreNotCheckedOut() {

        AvailableBook firstBook = new AvailableBook("Java", "Jones", 1992);
        User user=mock(User.class);
        CheckedOutBook secondBook = new CheckedOutBook("C", "Jones", 1995, user);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        HashSet<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);
        HashSet<Movie> movies = new HashSet<>();


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        String bookList = library.formattedAvailableBookString();

        assertEquals("Java                          |Jones                         |1992|          \n", bookList);
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
        User user=mock(User.class);

        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Book success = library.checkoutBook("C", user);

        assertEquals(Messages.SUCCESS_CHECKOUT_BOOK, success.checkoutMessage());
    }

    @Test
    public void shouldNotCheckoutIfBookIsCheckoutAndAvailable() {
        User user=mock(User.class);
        CheckedOutBook book = new CheckedOutBook("C", "Jones", 1995, user);
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

        Book success = library.checkoutBook("any",user);

        assertEquals(Messages.UNSUCCESS_CHECKOUT_BOOK, success.checkoutMessage());
    }

    @Test
    public void shouldReturnIfBookIsCheckout() {
        User user=mock(User.class);
        CheckedOutBook book = new CheckedOutBook("C", "Jones", 1995, user);
        HashSet<Book> books = new HashSet<>();
        books.add(book);
        HashSet<Movie> movies = new HashSet<>();
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        Library library = new Library(books, movies, booksPresenter, moviesPresenter);
        Book success = library.returnBook("C", user);

        assertEquals(Messages.SUCCESS_RETURN_BOOK, success.returnMessage());
    }

    @Test
    public void shouldNotReturnIfBookIsNotCheckoutOrNotAvailable() {
        User user=mock(User.class);
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

        Book success = library.returnBook("any",user);

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
        User user = mock(User.class);


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Movie success = library.checkoutMovie("C",user);

        assertEquals(Messages.SUCCESS_CHECKOUT_MOVIE, success.checkoutMessage());
    }

    @Test
    public void shouldNotCheckoutIfMovieIsCheckoutOrNotAvailable() {
        User user = mock(User.class);
        CheckedOutMovie book = new CheckedOutMovie("C",1883, "Jones", 1,user);
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

        Movie success = library.checkoutMovie("C",user);

        assertEquals(Messages.UNSUCCESS_CHECKOUT_MOVIE, success.checkoutMessage());
    }

    @Test
    public void shouldBeMovieDetailList() {

        AvailableMovie firstMovie = new AvailableMovie("Java",1993, "Jones", 1);
        AvailableMovie secondMovie = new AvailableMovie("OOPs",1995, "Patric", 5);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        HashSet<Book> books = new HashSet<>();

        HashSet<Movie> movies = new HashSet<>();
        movies.add(firstMovie);
        movies.add(secondMovie);


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        String bookList = library.formattedAvailableMovieString();

        assertEquals("OOPs,1995,Patric,5\n" +
                "Java,1993,Jones,1\n", bookList);
    }

    @Test
    public void shouldCheckoutMovie() {

        AvailableMovie firstMovie = new AvailableMovie("Java",1993, "Jones", 1);
        AvailableMovie secondMovie = new AvailableMovie("OOPs",1995, "Patric", 5);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");
        User user = mock(User.class);

        HashSet<Book> books = new HashSet<>();

        HashSet<Movie> movies = new HashSet<>();
        movies.add(firstMovie);
        movies.add(secondMovie);


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Movie movieList = library.checkoutMovie("OOPs",user);

        assertEquals(Messages.SUCCESS_CHECKOUT_MOVIE,movieList.checkoutMessage());
    }

    @Test
    public void shouldReturnMovie() {
        User user = mock(User.class);
        AvailableMovie firstMovie = new AvailableMovie("Java",1993, "Jones", 1);
        CheckedOutMovie secondMovie = new CheckedOutMovie("OOPs",1995, "Patric", 5,user);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");


        HashSet<Book> books = new HashSet<>();

        HashSet<Movie> movies = new HashSet<>();
        movies.add(firstMovie);
        movies.add(secondMovie);


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        Movie movieList = library.returnMovie("OOPs",user);

        assertEquals(Messages.SUCCESS_RETURN_MOVIE,movieList.returnMessage());
    }

    @Test
    public void shouldBeBooksDetailListWhichAreCheckedOut() {

        AvailableBook firstBook = new AvailableBook("Java", "Jones", 1992);
        User user=new ValidUser("9999-999","priyar","priya","priya@gmail.com",99999999);
        CheckedOutBook secondBook = new CheckedOutBook("C", "Jones", 1995, user);
        BooksPresenter booksPresenter = new BooksPresenter("");
        MoviesPresenter moviesPresenter = new MoviesPresenter("");

        HashSet<Book> books = new HashSet<>();
        books.add(firstBook);
        books.add(secondBook);
        HashSet<Movie> movies = new HashSet<>();


        Library library = new Library(books, movies, booksPresenter, moviesPresenter);

        String bookList = library.formattedCheckoutBookString();

        assertEquals("C                             |Jones                         |1995|9999-999 priya\n", bookList);
    }


}