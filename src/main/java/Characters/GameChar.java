package Characters;

import Locations.Location;
import Locations.NormalLocation;
import Locations.SafeHause;
import Locations.ToolStore;

import java.util.Scanner;


public class GameChar {

    static Scanner scanner = new Scanner(System.in);
    private int damage;
    private int health;
    private int money;
    private String charName;

    public GameChar(int damage, int health, int money, String charName) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.charName = charName;
    }

    public GameChar() {}

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public void selectChar() {

        Samurai samurai = new Samurai();
        Archer archer = new Archer();
        Knight knight = new Knight();

        int selectChar;

        do {
            System.out.println("Haydi Kendine Uygun Bir Karakter Seç!! \n KARAKTERLER");
            System.out.println("1-) Karakter: " + samurai.getCharName() + " Hasar:" + samurai.getDamage() + " Sağlık:" + samurai.getHealth() + " Para:" + samurai.getMoney());
            System.out.println("2-) Karakter: " + archer.getCharName() + "    Hasar:" + archer.getDamage() + " Sağlık:" + archer.getHealth() + " Para:" + archer.getMoney());
            System.out.println("3-) Karakter: " + knight.getCharName() + " Hasar:" + knight.getDamage() + " Sağlık:" + knight.getHealth() + " Para:" + knight.getMoney());

            selectChar = scanner.nextInt();

            switch (selectChar) {
                case 1:
                    System.out.println("1-) Karakter: " + samurai.getCharName() + " Hasar:" + samurai.getDamage() + " Sağlık:" + samurai.getHealth() + " Para:" + samurai.getMoney());
                    break;
                case 2:
                    System.out.println("2-) Karakter: " + archer.getCharName() + " Hasar:" + archer.getDamage() + " Sağlık:" + archer.getHealth() + " Para:" + archer.getMoney());
                    break;
                case 3:
                    System.out.println("3-) Karakter: " + knight.getCharName() + " Hasar:" + knight.getDamage() + "  Sağlık:" + knight.getHealth() + " Para:" + knight.getMoney());
                    break;
                default:
                    System.out.println("Lütfen geçerli bir karakter seçiniz.");
            }
        } while (selectChar > 3 || selectChar<=0);

    }

    public void selectLocation() {
        Location location = null;

        System.out.println("Gitmek İstediğiniz Bölgeyi Seçiniz \n BÖLGELER");
        System.out.println("1-) Güvenli Ev");
        System.out.println("2-) Mağaza");

        int selectLoc = scanner.nextInt();

        switch (selectLoc) {
            case 1:
                location = new SafeHause(this);
                break;
            case 2:
                location = new ToolStore(this);
                break;
            default:
                location = new SafeHause(this);
        }
        ((NormalLocation) location).onLocation();
    }

}
