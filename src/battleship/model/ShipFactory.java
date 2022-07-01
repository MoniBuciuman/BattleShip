package battleship.model;

import battleship.util.ShipType;
import battleship.util.SquareStatus;
import battleship.view.Input;

import java.util.Objects;

public class ShipFactory {

    //The BoardFactory class has a randomPlacement() method that handles random ship placement on board.
    public void randomPlacement() {

    }

    //The BoardFactory class has a manualPlacement() method that handles manual ship placement on board.
    public void manualPlacement() {

    }

    public static Square[] generateShipSquarePositions(int[] position, ShipType shipType, String input) {
        int row = position[0];
        int col = position[1];
        int numberOfCells = shipType.getLength();
        Square[] shipCoordinatesList = new Square[numberOfCells];
        for (int i = 0; i < numberOfCells; i++) {
            if (Objects.equals(input, "H")) {
                shipCoordinatesList[i] = new Square(row, col + i, SquareStatus.SHIP);
                System.out.println(row);
                System.out.println(col + i);
            } else if (Objects.equals(input, "V")) {
                shipCoordinatesList[i] = new Square(row + i, col, SquareStatus.SHIP);
            }

            System.out.println(row + i);
            System.out.println(col);
        }
        return shipCoordinatesList;
    }

    public boolean validateSquareList(Square[] shipSquarePositions, Square[][] board) {
        for (Square square : shipSquarePositions) {
            try {
                if (square.getRow() > board.length
                        || square.getCol() > board.length
                        || board[square.getRow()][square.getCol()].getStatus() == SquareStatus.SHIP) {
                    return true;
                }
            } catch (Exception e) {
                return true;
            }
        }
        return false;
    }


}
