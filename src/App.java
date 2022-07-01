import battleship.controller.Battleship;
import battleship.view.Display;
import battleship.view.Input;

public class App {
    public static void main(String[] args) {
        Display display = new Display();
        Input input = new Input(display);
        Battleship battleship = new Battleship(display, input);
        battleship.start();
    }
}
