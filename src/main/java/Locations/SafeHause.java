package Locations;

import Characters.GameChar;
import Characters.Player;

public class SafeHause extends NormalLocation{

    public SafeHause(GameChar gameChar) {
        super(gameChar, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
       System.out.println("Güvenli Evdesiniz.");
       System.out.println("Canınız Yenilendi.");
       return true;
    }

}
