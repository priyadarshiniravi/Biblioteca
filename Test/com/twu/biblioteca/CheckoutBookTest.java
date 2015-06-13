package com.twu.biblioteca;


import org.junit.Test;


import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CheckoutBookTest {
    @Test
    public void ShouldTakeInputInvalid()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Books books=mock(Books.class);
        CheckoutBook checkoutBook=new CheckoutBook(consoleInputOutput,books);

        checkoutBook.displayStrategy();

        verify(consoleInputOutput,times(1)).getInputAsString();


    }

    @Test
    public void shouldBeSuccessfulCheckout()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Books books=mock(Books.class);
        when(books.checkout(anyString()))
                .thenReturn(true);
        CheckoutBook checkoutBook=new CheckoutBook(consoleInputOutput,books);

        checkoutBook.displayStrategy();

        verify(consoleInputOutput,times(1)).print(Messages.SUCCESS_CHECKOUT);


    }


}