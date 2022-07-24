package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    Movie first = new Movie("Bladshot", "Action movie");
    Movie second = new Movie("Forward", "Cartoon");
    Movie third = new Movie("Hotel Belgrade", "Comedy");
    Movie fourth = new Movie("Gentlemen", "Action movie");
    Movie fifth = new Movie("Invisible Man", "Horror");
    Movie sixth = new Movie("Trolls. World tour", "Cartoon");
    Movie seventh = new Movie("Number one", "Comedy");
    Movie eighth = new Movie("Death on the Nile", "Crime");
    Movie ninth = new Movie("Spiderhead", "Fiction");
    Movie tenth = new Movie("Red notice", "Crime");
    Movie eleventh = new Movie("Time", "Thriller");


    @Test
    public void addTest() {
        MovieManager manager = new MovieManager();

        manager.add(first);
        manager.add(second);


        Movie[] actual = manager.findAll();
        Movie[] expected = {first, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLastFilms11() {
        MovieManager manager = new MovieManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Movie[] actual = manager.findLast();
        Movie[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLastFilms9() {
        MovieManager manager = new MovieManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Movie[] actual = manager.findLast();
        Movie[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestLastFilms10() {
        MovieManager manager = new MovieManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);


        Movie[] actual = manager.findLast();
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

}
