package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MovieTest {
    @Test
    public void shouldAppendMovieToFormattedMovies() {
        MoviesPresenter moviesPresenter = mock(MoviesPresenter.class);
        CheckedOutMovie movie=new CheckedOutMovie("Minions", 2015, "xyz", 10);

        movie.appendToMovies(moviesPresenter);

        verify(moviesPresenter).addMovie("Minions", 2015, "xyz", 10);

    }

    @Test
    public void equalityShouldSatisfyReflexivity() {
        AvailableMovie movie = new AvailableMovie("C++",1889, "author", 5);

        assertThat(movie, is(equalTo(movie)));
    }

    @Test
    public void equalityShouldSatisfySymmetricity() {
        AvailableMovie movieOne = new AvailableMovie("C++",1889, "author", 5);
        AvailableMovie movieTwo = new AvailableMovie("C++",1889, "author", 5);

        assertThat(movieOne, is(equalTo(movieTwo)));
        assertThat(movieTwo, is(equalTo(movieOne)));
    }


    @Test
    public void equalityShouldSatisfyTransitivity() {
        AvailableMovie movieOne = new AvailableMovie("C++",1889, "author", 5);
        AvailableMovie movieTwo = new AvailableMovie("C++",1889, "author", 5);
        AvailableMovie movieThree = new AvailableMovie("C++",1889, "author", 5);

        assertThat(movieOne, is(equalTo(movieTwo)));
        assertThat(movieTwo, is(equalTo(movieThree)));
        assertThat(movieOne, is(equalTo(movieThree)));
    }

    @Test
    public void equalityShouldReturnFalseOnPassingNull() {
        AvailableMovie movieOne = new AvailableMovie("C++",1889, "author", 5);

        assertFalse(movieOne.equals(null));
    }

    @Test
    public void whenTwoObjectsAreEqualThenTheirHashCodeMustBeEqual() {
        AvailableMovie movieOne = new AvailableMovie("C++",1889, "author", 5);
        AvailableMovie movieTwo = new AvailableMovie("C++",1889, "author", 5);

        assertThat(movieOne.hashCode(), is(equalTo(movieTwo.hashCode())));
    }

    @Test
    public void shouldMatchTitle()
    {
        AvailableMovie movieOne = new AvailableMovie("C++",1889, "author", 5);

        boolean actualIsExist=movieOne.isTitleMatch("C++");

        assertEquals(true,actualIsExist);
    }
}