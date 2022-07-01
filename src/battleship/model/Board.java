package battleship.model;

import battleship.util.SquareStatus;

import java.util.Arrays;

public class Board {
    //The Board class has a Square[][] ocean field. This contains the squares that the board consists of.
    private Square[][] squaresBoard;

    private int size;

    public Board(int size) {
        this.squaresBoard = new Square[size][size];
        this.size = size;
        this.initBoard(size);
    }

    //The Board class has an isPlacementOk() method that verifies if placement of ship is possible.
    public boolean isPlacementOk(){
        return false;
    }


    private void initBoard(int size){
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                this.squaresBoard[row][col] = new Square(row, col, SquareStatus.EMPTY);
            }
        }
    }

    public Square[][] getSquaresBoard() {
        return this.squaresBoard;
    }

}
