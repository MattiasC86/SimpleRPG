import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    private boolean gameOn;
    private Scanner sc;
    private Player player;

    Game() {
        gameOn = true;
        sc = new Scanner(System.in);
    }

    public void run() {
        showMainMenu();
    }

    private void chooseCharClass() {
        boolean correctInput = false;

        while(!correctInput) {
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.print("Choose class: ");

            try{
                int input = sc.nextInt();
                if(input == 1 || input == 2) {
                    player = new Player(input);
                    correctInput = true;
                }

            } catch (Exception e) {
                System.err.println("Entered value is not valid");
                sc.next();
            }
        }
        chooseName();
    }

    private void chooseName() {
        System.out.print("Choose a name: ");
        String name = sc.next();
        player.setName(name);
        viewPlayer();
    }

    private void viewPlayer() {
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("Name:\t\t\t" + player.getName());
        System.out.println("Class:\t\t\t" + player.getCharacterClass());
        System.out.println("\nStrength:\t\t" + player.getStrength());
        System.out.println("Spell power:\t" + player.getSpellPower());
        System.out.println("Vitality:\t\t" + player.getVitality());
        System.out.println("++++++++++++++++++++++++++++++++");
    }

    private void showMainMenu() {
        System.out.println("--------------------------");
        System.out.println("1. Start new game");
        System.out.println("2. Load saved game");
        System.out.println("3. Quit");
        System.out.println("--------------------------");
        int input = sc.nextInt();
        switch(input) {
            case 1:
                chooseCharClass();
                break;
            case 2:
                System.out.println("No saved games found");
                showMainMenu();
                break;
            case 3:
                System.out.println("Thank you for playing.");
                System.exit(0);
                break;
        }
    }
}
