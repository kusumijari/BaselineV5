package com.baseline.gameoflife;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class OutputTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWelcomeMessage() {
        Output output = new Output("Enter size of grid");

        output.displayMessage();

        assertEquals("Enter size of grid\n", outContent.toString());
    }


    @After
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}