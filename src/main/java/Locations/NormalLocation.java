package Locations;

import Characters.GameChar;

public abstract class NormalLocation extends Location{

    public NormalLocation(GameChar gameChar, String nameLocation) {
        super(gameChar, nameLocation);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
