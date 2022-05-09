package Characters;

import Characters.Archer;
import Characters.Knight;
import Characters.Samurai;
import Locations.Location;
import Locations.SafeHause;
import Locations.ToolStore;

import java.util.Locale;
import java.util.Scanner;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
