import Characters.GameChar;
import Characters.Player;

import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);

    private String player;
    private String location;

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz.");
        System.out.print("Lütfen Bir İsim Giriniz: ");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hey " + player.getName() + " Macera Oyununa Hoşgeldin.");
        GameChar gameChar = new GameChar();
        gameChar.selectChar();
        gameChar.selectLocation();

    }
}
