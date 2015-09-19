//Contains a grid in which cells can eihter be neighbours or not

package com.baseline.gameoflife;

public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isNeighbour(int thatX, int thatY) {
        return true;
    }
}
