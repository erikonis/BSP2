package lu.uni.programming1.lab4.exercise1;

import java.util.*;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false)");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String result;

        switch (menu) {

        case 1, 2 -> {
            result = adult == true ? "Red wine" : "Cola";
            System.out.println("The restaurant suggests: " + result);
        }

        case 3 -> {
            result = adult == true ? "White wine" : "Lemonade";
            System.out.println("The restaurant suggests: " + result);
        }

        case 4 -> {
            result = adult == true ? "Port wine" : "Still Water";
            System.out.println("The restaurant suggests: " + result);
        }

        case 5 -> {
            System.out.println("The restaurant suggests: Sparkling Water");
        }
        default -> {
            System.out.println("The restaurant does not have such a menu!");
        }
        }
    }
}
