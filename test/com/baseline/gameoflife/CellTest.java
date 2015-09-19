package com.baseline.gameoflife;

import org.junit.Test;

import static org.junit.Assert.*;

public class CellTest {

    @Test
    public void shouldReturnTrueIfTheCellIsAHorizontalNeighbourOnTheRight() {
        Cell cell = new Cell(0, 0, 'x');

        assertTrue(cell.isNeighbour(0, 1));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbour() {
        Cell cell = new Cell(0, 0, 'x');

        assertFalse(cell.isNeighbour(0, 2));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsAHorizontalNeighbourOnTheLeft() {
        Cell cell = new Cell(0, 1, 'x');

        assertTrue(cell.isNeighbour(0, 0));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsAVerticalNeighbourAndIsAbove() {
        Cell cell = new Cell(1, 0, 'x');

        assertTrue(cell.isNeighbour(0, 0));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsAVerticalCellndIsBelow() {
        Cell cell = new Cell(1, 0, 'x');

        assertTrue(cell.isNeighbour(2, 0));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsDiagonalAndUpAndLeft() {
        Cell cell = new Cell(1, 1, 'x');

        assertTrue(cell.isNeighbour(0, 0));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsDiagnolAndUpAndRight() {
        Cell cell = new Cell(1, 1, 'x');

        assertTrue(cell.isNeighbour(0, 2));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsDiagnolAndBelowAndLeft() {
        Cell cell = new Cell(1, 1, 'x');

        assertTrue(cell.isNeighbour(2, 0));
    }

    @Test
    public void shouldReturnTrueIfTheCellIsDiagnolAndBelowAndRight() {
        Cell cell = new Cell(1, 1, 'x');

        assertTrue(cell.isNeighbour(0, 2));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbourAndOnTheRowAboveOnTheRight() {
        Cell cell = new Cell(1, 1, 'x');

        assertFalse(cell.isNeighbour(0, 3));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbourAndOnTheRowAboveOnTheLeft() {
        Cell cell = new Cell(1, 2, 'x');

        assertFalse(cell.isNeighbour(0, 0));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbourAndOnTheBelowAboveOnTheRight() {
        Cell cell = new Cell(1, 1, 'x');

        assertFalse(cell.isNeighbour(2, 3));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbourAndOnTheBelowAboveOnTheLeft() {
        Cell cell = new Cell(2, 0, 'x');

        assertFalse(cell.isNeighbour(1, 2));
    }

    @Test
    public void shouldReturnFalseIfeTheCellIsNotANeighbourAndOnTheRowAboveOnTheRight() {
        Cell cell = new Cell(2, 1, 'x');

        assertFalse(cell.isNeighbour(0, 2));
    }

    @Test
    public void shouldReturnFalseIFtheCellNotANeighbourAndIsInTheLeftRowAndAbove() {
        Cell cell = new Cell(2, 2, 'x');

        assertFalse(cell.isNeighbour(0, 1));
    }

    @Test
    public void shouldReturnFalseIfTheCellIsNotANeighbourAndIsAboveInTheSameColumn() {
        Cell cell = new Cell(2, 1, 'x');

        assertFalse(cell.isNeighbour(0, 1));

    }

    @Test
    public void shouldReturnTrueIfTheStateOfTheTheOtherCellIsTheSame() {
        Cell cell1 = new Cell(2, 1, 'x');

        assertEquals(cell1, cell1);
    }

    @Test
    public void shouldReturnFalseIfTheOtherCellIsANullObject() {
        Cell cell1 = new Cell(2, 1, 'x');

        assertNotEquals(cell1, null);
    }

    @Test
    public void shouldReturnFalseIfTheOtherCellIsNotACellObject() {
        Cell cell1 = new Cell(2, 1, 'x');

        assertNotEquals(cell1, "not a cell object");
    }

    @Test
    public void shouldReturnFalseIfTheStateOfTheCellIsNotTheSame() {
        Cell cell1 = new Cell(2, 1, 'x');
        Cell cell2 = new Cell(1, 1, '-');

        assertEquals(cell1, cell2);
    }
}
