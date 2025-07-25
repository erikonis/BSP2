package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult. True or false ? Answer: ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        String drink;

        switch (menu) {
        case 1, 2:
            drink = adult ? "Red wine" : "Cola";
            System.out.println("The restaurant suggests: " + drink);
            break;
        case 3:
            drink = adult ? "White wine" : "Lemonade";
            System.out.println("The restaurant suggests: " + drink);
        case 4:
            drink = adult ? "Port wine" : "Still Water";
            System.out.println("The restaurant suggests: " + drink);
        case 5:
            drink = "Sparkling Water";
            System.out.println("The restaurant suggests: " + drink);
            break;
        default:
            System.out.println("The restaurant does not have such a menu!");
            break;
        }

    }
}
