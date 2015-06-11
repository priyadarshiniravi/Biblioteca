package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String args[])
    {   ConsoleInputOutput consoleInputOutput=new ConsoleInputOutput(new Scanner(System.in));
        Biblioteca biblioteca=new Biblioteca(consoleInputOutput);
        biblioteca.start();
    }
}
