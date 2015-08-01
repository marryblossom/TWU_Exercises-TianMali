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
}