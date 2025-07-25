package lab04.Ex. 1.copilot.sol1;

public package exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter menu type (1: Vegetarian, 2: Non-Vegetarian): ");
        int menuType = scanner.nextInt();
        System.out.println("Is the client an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        String beverage;
        switch (menuType) {
            case 1:
                beverage = isAdult ? "Wine" : "Juice";
                break;
            case 2:
                beverage = isAdult ? "Beer" : "Soda";
                break;
            default:
                beverage = "Water";
        }

        System.out.println("Suggested beverage: " + beverage);
    }
}
