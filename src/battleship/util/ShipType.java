package battleship.util;

public enum ShipType {
    //The ShipType enum represents ship types. The types are Carrier, Cruiser, Battleship, Submarine, and Destroyer.

    CARRIER(5),
    CRUISER(2),
    BATTLESHIP(4),
    SUBMARINE(1),
    DESTROYER(3);

    //Each ShipType has a unique length.
    private int length;

    //Constructor to initialize the instance variable
    ShipType(int length) {
        this.length = length;
    }
    public int getLength() {
        return this.length;
    }


    public static ShipType getShiptypeByInput(int input) {
        return switch (input) {
            case 1 -> CARRIER;
            case 2 -> CRUISER;
            case 3 -> BATTLESHIP;
            case 4 -> SUBMARINE;
            case 5 -> DESTROYER;
            default -> null;
        };
    }
}
