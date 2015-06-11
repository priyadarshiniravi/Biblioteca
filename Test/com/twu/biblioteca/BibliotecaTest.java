package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {

    @Test
    public void shouldDisplayWelcomeMessage()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Menu menu=mock(Menu.class);
        Biblioteca biblioteca=new Biblioteca(consoleInputOutput,menu);

        biblioteca.start();

        verify(consoleInputOutput).print(Messages.WELCOME_MESSAGE);
    }


}