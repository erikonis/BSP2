public package exercise1;

import java.util.Scanner;

public class Beverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter menu type (1: Vegetarian, 2: Non-Vegetarian): ");
        int menuType = scanner.nextInt();
        System.out.println("Is the client an adult? (true/false): ");
        boolean isAdult = scanner.nextBoolean();

        String beverage;
        if (menuType == 1) {
            if (isAdult) {
                beverage = "Wine";
            } else {
                beverage = "Juice";
            }
        } else if (menuType == 2) {
            if (isAdult) {
                beverage = "Beer";
            } else {
                beverage = "Soda";
            }
        } else {
            beverage = "Water";
        }

        System.out.println("Suggested beverage: " + beverage);
    }
}