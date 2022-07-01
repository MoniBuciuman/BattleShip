package battleship.view;

import battleship.model.Board;
import battleship.model.Square;
import battleship.util.ShipType;
import battleship.util.SquareStatus;

import java.util.ArrayList;
import java.util.Scanner;

import static battleship.util.ShipType.*;

public class Input {
    public Scanner scanner;
    private final Display display;


    public Input(Display display) {
        this.display = display;
        this.scanner = new Scanner(System.in);
    }

    public int getMainMenuInput() {
        int input = 0;
        boolean invalidInput = true;
        while (invalidInput) {
            try {
                input = scanner.nextInt();
                if (input > 0 && input <= 3) {
                    invalidInput = false;
                } else {
                    display.invalidInputMessage();
                }
            } catch (Exception e) {
                display.invalidInputMessage();
                scanner = new Scanner(System.in);
            }
        }
        return input;
    }


    public int getBoardSize() {
        boolean invalidInput = true;
        int input = 0;
        while (invalidInput) {
            try {
                input = scanner.nextInt();
                if (input >= 8 && input <= 16) {
                    invalidInput = false;
                } else {
                    display.invalidInputMessage();
                }
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                display.invalidInputMessage();
            }
        }
        return input;
    }
    //The Input class is responsible for gathering all input. It also provides a seperate method for each case.
    //The Input class handles input validation.

    public int[] getPlacementCoordinates(int size, Board board) {
        boolean isInvalid = true;
        int[] coordinates = new int[2];
        scanner = new Scanner(System.in);
        do {
            try {
                display.getCoordinatesMessage();
                String input = scanner.nextLine().toUpperCase();
                int row = (int) input.charAt(0) - 65;
                int col = Integer.parseInt(input.substring(1)) - 1;
                if (row >= 0 && col >= 0
                        && row < size
                        && col < size && board.getSquaresBoard()[row][col].getStatus() == SquareStatus.EMPTY) {
                    coordinates[0] = row;
                    coordinates[1] = col;
                    isInvalid = false;
                }
            } catch (Exception e) {
                display.invalidInputMessage();
            }
        }
        while (isInvalid);
        return coordinates;
    }

    public String getShipDirection() {
        boolean invalidInput = true;
        String input = "";
        while (invalidInput) {
            display.getShipDirectionMessage();
            input = scanner.nextLine().toUpperCase();
            if (input.equals("H") || input.equals("V")) {
                invalidInput = false;
            } else
                display.invalidInputMessage();
        }
        return input;

    }

    public int getShipSelection() {
        boolean invalidInput = true;
        int input = 0;
        while (invalidInput) {
            try {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    invalidInput = false;
                } else {
                    display.invalidInputMessage();
                }
            } catch (Exception e) {
                scanner = new Scanner(System.in);
                display.invalidInputMessage();
            }
        }
        return input;
    }




}
