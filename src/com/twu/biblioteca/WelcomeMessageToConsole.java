package com.twu.biblioteca;

//Print Ouput Message onto the Screen
public class WelcomeMessageToConsole {
    String message;

    public WelcomeMessageToConsole(String message)
    {
        this.message=message;
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome To Biblioteca!!!");
    }

    public void displayMenu() {
        System.out.println("1.List Books");
    }

}