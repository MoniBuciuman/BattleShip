package battleship.util;

public enum SquareStatus {
    //The SquareStatus enum represents possible square statuses (empty, ship, hit, missed).
    //Each SquareStatus has a unicode character that can be used for printing it out.


    EMPTY("~"),
    SHIP("S"),
    HIT("H"),
    MISSED("M");


    // This unicode character is returned by a SquareStatus.GetCharacter() method.
    private String character;

    //Constructor to initialize the instance variable
    SquareStatus(String character) {
        this.character = character;
    }

    // This unicode character is returned by a SquareStatus.GetCharacter() method.

    public String getCharacter() {
        return this.character;
    }

}

