package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Matchers;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class MenuTest {
    @Test
    public void ShouldTakeInputValid() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Parser parser = mock(Parser.class);
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Exit");
        MenuOption menuOption = mock(MenuOption.class);
        when(menuOption.isExitOption())
                .thenReturn(2);
        Menu menu = new Menu(consoleInputOutput, parser, menuOption);
        Options optionsStub = mock(Options.class);
        when(consoleInputOutput.getInputAsNumber())
                .thenReturn(1, 2);
        when(parser.parse(1))
                .thenReturn(optionsStub);
        User user=mock(User.class);

        menu.chooseOption(user);

        verify(consoleInputOutput, times(2)).getInputAsNumber();
    }

    @Test
    public void ShouldTakeInputInvalid() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Parser parser = mock(Parser.class);
        MenuOption menuOption = mock(MenuOption.class);
        when(menuOption.isExitOption())
                .thenReturn(2);
        Menu menu = new Menu(consoleInputOutput, parser, menuOption);

        when(consoleInputOutput.getInputAsNumber())
                .thenReturn(300, 2);
        User user=mock(User.class);

        menu.chooseOption(user);

        verify(consoleInputOutput, times(3)).print(Matchers.<String>any());
    }

    @Test
    public void ShouldTakeExitInput() {
        ConsoleInputOutput consoleInputOutput = mock(ConsoleInputOutput.class);
        Parser parser = mock(Parser.class);
        ArrayList<String> options = new ArrayList<>();
        options.add("Display Books");
        options.add("Checkout Book");
        options.add("Exit");
        MenuOption menuOption = mock(MenuOption.class);
        when(menuOption.isExitOption())
                .thenReturn(3);
        Menu menu = new Menu(consoleInputOutput, parser, menuOption);
        Options optionsStub = mock(Options.class);
        when(consoleInputOutput.getInputAsNumber())
                .thenReturn(3);
        User user=mock(User.class);

        menu.chooseOption(user);

        verify(consoleInputOutput, times(1)).getInputAsNumber();
    }


}