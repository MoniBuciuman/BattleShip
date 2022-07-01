package battleship.view;

import battleship.model.Board;
import battleship.model.Square;
import battleship.util.ShipType;
import battleship.util.SquareStatus;

public class Display {


    // DONE -- The Display class prints the game menu.
    public void displayMenu() {
        StringBuilder mainMenu = new StringBuilder();
        mainMenu.append("1. Start new game \n");
        mainMenu.append("2. Display high scores \n");
        mainMenu.append("3. Exit \n");
        System.out.println(mainMenu);
    }


    //The Display class prints the gameplay


    //The Display class prints the board during manual ship placement process.
    public void displayBoard(Square[][] board) {
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < board.length; i++) {
            sb.append(" " + (i + 1) + " ");
        }
        for (int i = 0; i < board.length; i++) {
            sb.append("\n" + (char) (65 + i));
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].getStatus() == SquareStatus.HIT) {
                    sb.append(" H ");
                } else if (board[i][j].getStatus() == SquareStatus.MISSED) {
                    sb.append(" M ");
                } else if (board[i][j].getStatus() == SquareStatus.SHIP) {
                    sb.append(" S ");
                } else
                    sb.append(" ~ ");
            }
        }
        System.out.println(sb);
    }


    //The Display class prints the outcome of the game when it is over.
    public void winningMessage() {
        System.out.println("Player has won!");
    }

    public void invalidInputMessage() {
        System.out.println("Invalid input. Try again. \n");
    }

    public void highscoreMessage() {
        System.out.println("The highscore is:\n");
    }

    public void getBoardSizeMessage() {
        System.out.println("Enter the size of the board (a no. between 8 and 16): \n");
    }

    public void getCoordinatesMessage() {
        System.out.println("Enter ship coordinates: \n");
    }

    public void getShipDirectionMessage() {
        System.out.println("Select ship direction. Enter H for horizontal and V for Vertical.");
    }

    public void getShipTypeMenu() {
        StringBuilder sb = new StringBuilder("Select a type of ship from the below menu: \n");
        sb.append("1.CARRIER \n");
        sb.append("2.CRUISER \n");
        sb.append("3.BATTLESHIP \n");
        sb.append("4.SUBMARINE \n");
        sb.append("5.DESTROYER \n");
        System.out.println(sb);
    }

}
