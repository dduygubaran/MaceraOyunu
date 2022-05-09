package Locations;

import Characters.GameChar;

public abstract class Location {

    private GameChar gameChar;
        private String nameLocation;

    public Location(GameChar gameChar, String nameLocation) {
        this.gameChar = gameChar;
        this.nameLocation = nameLocation;
    }

    public GameChar getGameChar() {
        return gameChar;
    }

    public void setGameChar(GameChar gameChar) {
        this.gameChar = gameChar;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    abstract boolean onLocation();
}
