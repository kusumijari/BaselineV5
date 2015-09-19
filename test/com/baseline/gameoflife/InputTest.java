package com.baseline.gameoflife;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class InputTest {

    private final ByteArrayInputStream inContent = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setUpStreams() {
        System.setIn(inContent);
    }

    @Test
    public void shouldRecieveInput() {
        View view = new View();

        assertEquals("1", view.getInput());
    }

    @After
    public void cleanUpStreams() {
        System.setIn(System.in);
    }

}