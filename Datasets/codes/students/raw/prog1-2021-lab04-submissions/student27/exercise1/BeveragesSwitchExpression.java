package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String bevrage = switch (menu) {
            case 1, 2 -> "The restaurant suggests: " + (adult ? "Red wine" : "Cola");
            case 3 -> "The restaurant suggests: " + (adult ? "White wine" : "Lemonade");
            case 4 -> "The restaurant suggests: " + (adult ? "Port wine" : "Still water");
            case 5 -> "The restaurant suggests: Sparkling water";
            default -> {
                yield "The restaurant does not have such a menu!";
            }
        };

        System.out.println(bevrage);
    }
}
