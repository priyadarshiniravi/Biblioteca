package com.twu.biblioteca;

public class UserInformation implements Options {
    ConsoleInputOutput consoleInputOutput;
    Library library;

    public UserInformation(ConsoleInputOutput consoleInputOutput, Library library) {
        this.consoleInputOutput = consoleInputOutput;
        this.library = library;
    }

    @Override
    public void action(User user) {
        consoleInputOutput.print(user.InformationString());

    }
}
