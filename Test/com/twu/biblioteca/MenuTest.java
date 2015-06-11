package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {
    @Test
    public void ShouldTakeInputValid()
    {
        ConsoleInputOutput consoleInputOutput=mock(ConsoleInputOutput.class);
        Parser parser=mock(Parser.class);
        Menu menu=new Menu(consoleInputOutput,parser);
        Options options=mock(Options.class);
        when(consoleInputOutput.getInput())
                .thenReturn(1);
        when(parser.parse(1))
                .thenReturn(options);

        menu.chooseOption();

        verify(consoleInputOutput).getInput();
    }

    

}