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


    }


}