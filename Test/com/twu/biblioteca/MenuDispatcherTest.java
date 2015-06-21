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
        Login login=mock(Login.class);

        menuDispatcher.callMenu(validUser,login);

        verify(validUserMenuStub).chooseOption(validUser,login);


    }

    @Test
    public void shouldInvalidUserMenu() {
        Menu validUserMenuStub = mock(Menu.class);
        Menu invalidUserMenuStub = mock(Menu.class);
        Menu librarianUserMenuStub = mock(Menu.class);
        MenuDispatcher menuDispatcher = new MenuDispatcher(invalidUserMenuStub, validUserMenuStub, librarianUserMenuStub);
        InvalidUser validUser=new InvalidUser("", "", "", "", 0);
        Login login=mock(Login.class);

        menuDispatcher.callMenu(validUser,login);

        verify(invalidUserMenuStub).chooseOption(validUser,login);


    }

    @Test
    public void shouldLibrarianUserMenu() {
        Menu validUserMenuStub = mock(Menu.class);
        Menu invalidUserMenuStub = mock(Menu.class);
        Menu librarianUserMenuStub = mock(Menu.class);
        MenuDispatcher menuDispatcher = new MenuDispatcher(invalidUserMenuStub, validUserMenuStub, librarianUserMenuStub);
        LibrarianUser librarianUser=new LibrarianUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);
        Login login=mock(Login.class);

        menuDispatcher.callMenu(librarianUser,login);

        verify(librarianUserMenuStub).chooseOption(librarianUser,login);


    }

}