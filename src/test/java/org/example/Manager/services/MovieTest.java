package org.example.Manager.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieTest {
    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();
        manager.add("terminator");


        String[] expected = {"terminator" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        MoviesManager manager = new MoviesManager();
        manager.add("terminator");
        manager.add("BloodShot");


        String[] expected = {"terminator", "BloodShot" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testThree() {
        MoviesManager manager = new MoviesManager();
        manager.add("terminator");
        manager.add("BloodShot");
        manager.add("Aliens");


        String[] expected = {"terminator", "BloodShot","Aliens" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testZero() {
        MoviesManager manager = new MoviesManager();




        String[] expected = {  };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
