package com.baseline.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CellTest {

    @Test
    public void shouldReturnTrueIfTheCellIsAHorizontalNeighbourOnTheRight() {
        Cell cell = new Cell(0, 0);

        assertTrue(cell.isNeighbour(0, 1));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbour() {
        Cell cell = new Cell(0, 0);

        assertFalse(cell.isNeighbour(0, 2));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsAHorizontalNeighbourOnTheLeft() {
        Cell cell = new Cell(0, 1);

        assertTrue(cell.isNeighbour(0, 0));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsAVerticalNeighbourAndIsAbove() {
        Cell cell = new Cell(1, 0);

        assertTrue(cell.isNeighbour(0, 0));
    }
}