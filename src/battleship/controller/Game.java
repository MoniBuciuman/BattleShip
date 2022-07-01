package battleship.controller;

import battleship.model.Board;
import battleship.model.ShipFactory;
import battleship.model.Square;
import battleship.util.ShipType;
import battleship.view.Display;
import battleship.view.Input;

import java.util.Arrays;

public class Game {
    Input input;
    Display display;
    ShipFactory shipFactory;

    public Game() {
    }

    public Game(Input input, Display display) {
        System.out.println("Mananca o soseta");
        this.input = input;
        this.display = display;
        this.shipFactory = new ShipFactory();
    }


    //The Game class has a loop in which players make moves.
    public void startGame() {
        display.getBoardSizeMessage();
        int size = input.getBoardSize();
        Board board = new Board(size);
        display.displayBoard(board.getSquaresBoard());


        boolean isInvalidCoordinatesValid = true;
        while (isInvalidCoordinatesValid) {
            display.getShipTypeMenu();
            int shipTypeMenuSelection = input.getShipSelection();
            ShipType typeOfShip = ShipType.getShiptypeByInput(shipTypeMenuSelection);
            int[] coordinates = input.getPlacementCoordinates(size, board);
            String shipDirection = input.getShipDirection();
            Square[] coordinateList = ShipFactory.generateShipSquarePositions(coordinates, typeOfShip, shipDirection);
            System.out.println(shipFactory.validateSquareList(coordinateList, board.getSquaresBoard()));
            isInvalidCoordinatesValid = shipFactory.validateSquareList(coordinateList, board.getSquaresBoard());
            System.out.println(isInvalidCoordinatesValid);
        }


    }
    //The Game class has a logic which determines the flow of round.
    //The Game class has a condition on which game ends.
    //The Game class provides different game modes which use different round flows.
}
