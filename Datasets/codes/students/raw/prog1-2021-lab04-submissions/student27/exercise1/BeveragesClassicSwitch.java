package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id: ");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = scanner.nextBoolean();

        scanner.close();

        switch (menu) {
        case 1, 2:
            System.out.printf("The restaurant suggests: " + (adult ? "Red wine" : "Cola"));
            break;
        case 3:
            System.out.printf("The restaurant suggests: " + (adult ? "White wine" : "Lemonade"));
            break;
        case 4:
            System.out.printf("The restaurant suggests: " + (adult ? "Port wine" : "Still water"));
            break;
        case 5:
            System.out.println("The restaurant suggests: Sparkling water");
            break;
        default:
            System.out.println("The restaurant does not have such a menu!");
            break;
        }

    }
}
