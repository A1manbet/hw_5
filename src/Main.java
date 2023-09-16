import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Boss adamSmasher = new Boss();
        adamSmasher.setHealth(700);
        adamSmasher.setDamage(100);
        adamSmasher.setDefence("physical");
        
        System.out.println("Health: " + adamSmasher.getHealth());
        System.out.println("Damage: " + adamSmasher.getDamage());
        System.out.println("Defence: " + adamSmasher.getDefence());

        Hero[] heroes = createHeroes();


        for (Hero x : heroes) {
            System.out.println("Damage: " + x.getDamage() + " Health: " + x.getHealth() + " Super power: " + x.getSuperPower());
        }


    }
    public static Hero[] createHeroes(){

        Hero leonardo = new Hero(250, 30, "magical");
        Hero donatello = new Hero(300, 40);
        Hero mikey = new Hero(250, 40, "super Fast");

        Hero[] arrayHeroes = new Hero[3];

        arrayHeroes[0] = leonardo;
        arrayHeroes[1] = donatello;
        arrayHeroes[2] = mikey;

        return arrayHeroes;
    }


}