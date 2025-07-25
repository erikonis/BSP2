package lu.uni.programming1.lab4.exercise1;

import java.util.Scanner;

public class BeveragesClassicSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the selected menu id:");
        int menu = scanner.nextInt();

        System.out.print("Please enter whether the client is an adult: (True/false)");

        boolean adult = scanner.nextBoolean();
        String True;

        switch (menu) {
        case 1:
            System.out.print("The restaurant suggests: ");
            True = adult ? "Red wine" : "Cola";
            System.out.println(True);
            break;
        case 2:
            System.out.print("The restaurant suggests: ");
            True = adult ? "Red wine" : "Cola";
            System.out.println(True);
            break;
        case 3:
            System.out.print("The restaurant suggests: ");
            True = adult ? "White wine" : "Lemonade";
            System.out.println(True);
            break;
        case 4:
            System.out.print("The restaurant suggests: ");
            True = adult ? "Port wine" : "Still Water ";
            System.out.println(True);
            break;
        case 5:
            System.out.print("The restaurant suggests: Sparkling Water ");
        default:
            System.out.println("The restaurant does not have such a menu!");
            break;
        }
        scanner.close();

    }

}
