package com.twu.biblioteca;


import java.util.HashSet;

public class Library {
    private HashSet<Book> books;

    public Library(HashSet<Book> books) {
        this.books = books;
    }

    public synchronized Book checkout(String title) {
        Book book = search(title);
        books.remove(book);
        books.add(book.checkoutBook());
        return book.checkoutBook();
    }

    public synchronized Book returnBook(String title) {
        Book book = search(title);
        books.remove(book);
        books.add(book.returnBook());
        return book.returnBook();
    }

    @Override
    public String toString() {
        BooksPresenter booksPresenter = new BooksPresenter(new String());
        for (Book book:books) {
            if(book instanceof AvailableBook) {
                book.appendBooks(booksPresenter);
            }
        }
        return booksPresenter.toString();
    }

    private Book search(String title) {
        for (Book book : books) {
            if (book.isTitleMatch(title))
                return book;
        }
        return new NullBook(null, null, 0);
    }
}
