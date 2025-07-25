package ex1;

import java.util.Scanner;

public class BeveragesSwitchExpression {

    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our restaurant!");
        System.out.print("Are you an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        System.out.print("What menu did you choose? (1-3): ");
        int menu = scanner.nextInt();

        String suggestion = switch (menu) {
            case 1 -> "You chose Menu 1.\nWe suggest you " + (isAdult ? "wine" : "water") + " as a beverage.";
            case 2 -> "You chose Menu 2.\nWe suggest you " + (isAdult ? "beer" : "coke") + " as a beverage.";
            case 3 -> "You chose Menu 3.\nWe suggest you " + (isAdult ? "cocktail" : "juice") + " as a beverage.";
            default -> "Invalid menu choice.";
        };

        System.out.println(suggestion);
    }
}