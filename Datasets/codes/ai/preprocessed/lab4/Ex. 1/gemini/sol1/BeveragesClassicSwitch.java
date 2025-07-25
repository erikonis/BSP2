import java.util.Scanner;

public class BeveragesClassicSwitch {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our restaurant!");
        System.out.print("Are you an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        System.out.print("What menu did you choose? (1-3): ");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("You chose Menu 1.");
                System.out.println("We suggest you " + (isAdult ? "wine" : "water") + " as a beverage.");
                break;
            case 2:
                System.out.println("You chose Menu 2.");
                System.out.println("We suggest you " + (isAdult ? "beer" : "coke") + " as a beverage.");
                break;
            case 3:
                System.out.println("You chose Menu 3.");
                System.out.println("We suggest you " + (isAdult ? "cocktail" : "juice") + " as a beverage.");
                break;
            default:
                System.out.println("Invalid menu choice.");
        }
    }
}