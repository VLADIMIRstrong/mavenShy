package org.example.Manager.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondMovieTest { @Test
public void test() {
    MoviesManager manager = new MoviesManager();
    manager.add("terminator");



    String[] expected = {"terminator" };
    String[] actual = manager.findLast();
    Assertions.assertArrayEquals(expected, actual);
}

    @Test
    public void testSecond() {
        MoviesManager manager = new MoviesManager();
        manager.add("Terminator");
        manager.add("BloodShot");

        //  manager.add("ninja");
        // manager.add("Spawn");
        //  manager.add("Godzilla");
        //   manager.add("Rump");
        //  manager.add("Corn");
        // manager.add("Apple");
        // manager.add("Noyce");


        String[] expected = {"BloodShot","Terminator" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSecondManager() {
        MoviesManager manager = new MoviesManager(11);
        manager.add("Terminator");
        manager.add("BloodShot");

        manager.add("Ninja");
        manager.add("Spawn");
        manager.add("Godzilla");
        manager.add("Rump");
        manager.add("Corn");
        manager.add("Apple");
        manager.add("Noyce");
        manager.add("Blood");
        manager.add("Blue");




        String[] expected = {"Blue","Blood","Noyce","Apple","Corn","Rump","Godzilla","Spawn","Ninja",
                "BloodShot","Terminator" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
