//Contains a grid in which cells can eihter be neighbours or not

package com.baseline.gameoflife;

public class Cell {
    private int x;
    private int y;
    private char state;

    public Cell(int x, int y, char state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    public boolean isNeighbour(int thatX, int thatY) {
        if((thatY == y + 1 && thatX == x - 1) || (thatY == y - 1 && thatX == x) || (thatX == x - 1 && thatY == y)
                || (thatX == x + 1 && thatY == y) || (thatX == x + 1 && thatY == y + 1) || (thatY == y + 1 && thatX == x)
                || (thatX == x + 1 && thatY == y - 1) || (thatX == x -1 && thatY == y - 1)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object that){
        if(that == null || (that.getClass() != Cell.class)) {
            return false;
        }
        Cell thatCell = (Cell) that;
        if(thatCell.state == (this.state)){
            return true;
        }
        return false;
    }
}
