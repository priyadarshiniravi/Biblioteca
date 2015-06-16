package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class BookParserTest {
    @Test
    public void shouldParseInputIntoBook() {
        BookParser bookParser = new BookParser();

        Book actualBook = bookParser.parse("C++");
        Book expectedBook = new AvailableBook("C++", "", 0);

        Assert.assertEquals(expectedBook, actualBook);


    }

}