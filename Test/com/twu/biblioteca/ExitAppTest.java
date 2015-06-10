package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class ExitAppTest {
    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitSystem() {
        ExitApp exitApp = new ExitApp();
        exit.expectSystemExitWithStatus(0);
        exitApp.displayStrategy();
    }

}