package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesSwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult (true/false): ");
        boolean adult = scanner.nextBoolean();
        String Beverage;
        scanner.close();

        Beverage = switch (menu) {
        case 1, 2 -> "the restaurant suggests: " + (adult ? "Red wine" : "Cola");
        /* case 2 -> Beverage = adult ? "Red wine" : "Cola"; */
        case 3 -> "The restaurant suggests "+ (adult ? "White wine" : "Lemonade");

        case 4 -> "The restaurant suggests" + (adult ? "Port wine" : "still water");

        case 5 -> "The restaurant suggests" + (adult ? "Sparkling water" : "Sparkling water");

        default -> "The restaurant does not have such a menu!";
        };
        System.out.println(Beverage);
    }
}
