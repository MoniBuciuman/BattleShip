package battleship.controller;

import battleship.view.Display;
import battleship.view.Input;

public class Battleship {

    private Display display;
    private Input input;
//    private Game game;

    public Battleship(Display display, Input input) {
        this.display = display;
        this.input = input;
    }

    public void start() {
        Game game = new Game(input,display);
        display.displayMenu();
        int startingInput = input.getMainMenuInput();
        switch (startingInput) {
            case 1:
                game.startGame();
                break;
            case 2:
                display.highscoreMessage();
                break;
            case 3:
                System.exit(0);
                break;

        }
    }
    // DONE -- The Battleship class has Display and Input fields that are used throughout the program.
    //The Battleship class has a loop in which the program runs.
    //DONE -- The Battleship class displays the main menu and allows the user to a start new game, display high scores, and exit.
}
