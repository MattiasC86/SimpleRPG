import java.util.Scanner;

public class Battle {

    Scanner sc = new Scanner(System.in);

    public void beforeBattle(Player player, Enemy enemy) {
        System.out.println(player.getName() + " walks through the woods and suddenly gets attacked by a " + enemy.getName());
        System.out.println("1. Fight");
        System.out.println("2. Flee");
        System.out.print("I want to: ");
        int input = sc.nextInt();

        switch(input) {
            case 1:
                break;
            case 2:
                fleeBattle(player, enemy);
                break;
        }
    }

    public void startBattle(Player player, Enemy enemy) {
        while(true) {
            System.out.println("ff");
            System.out.println("ff");

        }
    }
    

    public void fleeBattle(Player player, Enemy enemy) {
        System.out.println("You cowardly flee the battle while the " + enemy + " is taunting you.");
    }

}
