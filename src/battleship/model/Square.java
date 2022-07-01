package battleship.model;

import battleship.util.SquareStatus;

public class Square {
    //The Square class contains X and Y fields.
    //The Square class has a SquareStatus field.

    private int row;
    private int col;
    private SquareStatus status;

    public Square(int row, int col, SquareStatus status) {
        this.row = row;
        this.col = col;
        this.status = status;
    }

    public SquareStatus getStatus() {
        return status;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    //The Square class has method that returns a graphical representation of SquareStatus.


}
