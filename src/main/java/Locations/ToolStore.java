package Locations;

import Characters.GameChar;
import Characters.Player;

public class ToolStore extends NormalLocation{

    public ToolStore(GameChar gameChar) {
        super(gameChar, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazadasınız.");
        return true;
    }

    public void menu() {

    }

    public void buy() {

    }
}
