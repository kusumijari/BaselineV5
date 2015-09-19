package com.baseline.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UniverseTest {
    @Test
    public void shouldGetSizeOfGridFromUser() {
        Input mockInput = mock(Input.class);
        Universe universe = new Universe(mockInput);
        when(mockInput.getInput()).thenReturn("3");

        assertEquals("3", universe.acceptSize());
    }
}