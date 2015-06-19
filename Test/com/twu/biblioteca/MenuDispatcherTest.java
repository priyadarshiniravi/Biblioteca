package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MenuDispatcherTest {
    @Test
    public void shouldValidUserMenu() {
        Menu validUserMenuStub = mock(Menu.class);
        Menu invalidUserMenuStub = mock(Menu.class);
        Menu librarianUserMenuStub = mock(Menu.class);
        MenuDispatcher menuDispatcher = new MenuDispatcher(invalidUserMenuStub, validUserMenuStub, librarianUserMenuStub);
        ValidUser validUser=new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        menuDispatcher.callMenu(validUser);

        verify(validUserMenuStub).chooseOption(validUser);


    }

    @Test
    public void shouldInvalidUserMenu() {
        Menu validUserMenuStub = mock(Menu.class);
        Menu invalidUserMenuStub = mock(Menu.class);
        Menu librarianUserMenuStub = mock(Menu.class);
        MenuDispatcher menuDispatcher = new MenuDispatcher(invalidUserMenuStub, validUserMenuStub, librarianUserMenuStub);
        InvalidUser validUser=new InvalidUser("", "", "", "", 0);

        menuDispatcher.callMenu(validUser);

        verify(invalidUserMenuStub).chooseOption(validUser);


    }

    @Test
    public void shouldLibrarianUserMenu() {
        Menu validUserMenuStub = mock(Menu.class);
        Menu invalidUserMenuStub = mock(Menu.class);
        Menu librarianUserMenuStub = mock(Menu.class);
        MenuDispatcher menuDispatcher = new MenuDispatcher(invalidUserMenuStub, validUserMenuStub, librarianUserMenuStub);
        LibrarianUser librarianUser=new LibrarianUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        menuDispatcher.callMenu(librarianUser);

        verify(librarianUserMenuStub).chooseOption(librarianUser);


    }

}