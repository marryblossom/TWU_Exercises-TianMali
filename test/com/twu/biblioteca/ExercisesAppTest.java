package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by marry on 7/26/15.
 */
public class ExercisesAppTest {
    ExercisesApp exercisesApp;

    @Before
    public void setUp() throws Exception {
        exercisesApp = new ExercisesApp();
    }

    @Test
    public void testHorizontal() throws Exception {
        assertEquals("*", exercisesApp.horizontal(1));
    }
    @Test
    public void testHorizontal_1() throws Exception {
        assertEquals("**", exercisesApp.horizontal(2));
    }
    @Test
    public void testVertical() throws Exception {
        assertEquals("*\n" + "*", exercisesApp.vertical(2));
    }
    @Test
    public void testTriangle() throws Exception {
        assertEquals("*\n" + "**\n" + "***\n", exercisesApp.triangle(3));
    }
    @Test
    public void testIsoscelesTriangle() throws Exception {
        String[] s = new String[3];
        s[0] = "  *";
        s[1] = " ***";
        s[2] = "*****";
        for(int i=0;i<s.length;i++){
            assertEquals(s[0], exercisesApp.isoscelesTriangle(3)[0]);
            assertEquals(s[1], exercisesApp.isoscelesTriangle(3)[1]);
            assertEquals(s[2], exercisesApp.isoscelesTriangle(3)[2]);
        }

    }
    @Test
    public void testFizzBuzz() throws Exception {
        String[] s = new String[20];
        s[0] = "1";
        s[1] = "2";//
        s[2] = "Fizz";
        s[3] = "4";
        s[4] = "Buzz";
        s[5] = "Fizz";
        s[6] = "7";
        s[7] = "8";
        s[8] = "Fizz";
        s[9] = "Buzz";
        s[10] = "11";
        s[11] = "Fizz";
        s[12] = "13";
        s[13] = "14";
        s[14] = "FizzBuzz";
        for(int i=0;i<s.length;i++){
            assertEquals(s[0], exercisesApp.fizzBuzz(15)[0]);
            assertEquals(s[1], exercisesApp.fizzBuzz(15)[1]);
            assertEquals(s[2], exercisesApp.fizzBuzz(15)[2]);
            assertEquals(s[3], exercisesApp.fizzBuzz(15)[3]);
            assertEquals(s[4], exercisesApp.fizzBuzz(15)[4]);
            assertEquals(s[5], exercisesApp.fizzBuzz(15)[5]);
            assertEquals(s[6], exercisesApp.fizzBuzz(15)[6]);
            assertEquals(s[7], exercisesApp.fizzBuzz(15)[7]);
            assertEquals(s[8], exercisesApp.fizzBuzz(15)[8]);
            assertEquals(s[9], exercisesApp.fizzBuzz(15)[9]);
            assertEquals(s[10], exercisesApp.fizzBuzz(15)[10]);
            assertEquals(s[11], exercisesApp.fizzBuzz(15)[11]);
            assertEquals(s[12], exercisesApp.fizzBuzz(15)[12]);
            assertEquals(s[13], exercisesApp.fizzBuzz(15)[13]);
            assertEquals(s[14], exercisesApp.fizzBuzz(15)[14]);
        }

    }
    @Test
    public void testPrimeFactors() throws Exception {
        String s = "[2, 2, 3, 3, 5, 7, 11]";
        assertEquals(s, exercisesApp.primeFactors(13860).toString());
    }

}