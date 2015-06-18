package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class MenuDispatcherTest {
    @Test
    public void shouldValidUserMenu() {
        Menu validUserMenuStub = mock(Menu.class);
        Menu invalidUserMenuStub = mock(Menu.class);
        Menu librarianUserMenuStub = mock(Menu.class);
        MenuDispatcher menuDispatcher = new MenuDispatcher(invalidUserMenuStub, validUserMenuStub, librarianUserMenuStub);
        ValidUser validUser=new ValidUser("3333-333", "password", "name", "emailid@gmail.com", 99857969);

        menuDispatcher.callMenu(validUser);


    }

}