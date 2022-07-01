package battleship.model;

import java.util.List;

public class Ship {
    //The Ship class has a List<Square> field. It contains the squares where the ship is located.
    List<Square> ship ;


    public Ship(List<Square> ship) {
        this.ship = ship;
    }
}
