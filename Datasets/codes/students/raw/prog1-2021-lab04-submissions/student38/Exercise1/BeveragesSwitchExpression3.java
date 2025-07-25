package lu.uni.programming1.lab4.Exercise1;

import java.util.Scanner;

public class BeveragesSwitchExpression3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the selected menu id :");
        int menu = sc.nextInt();
        System.out.print("Please enter whether the client is an adult: (true/false) ");
        boolean adult = sc.nextBoolean();
        String correct;

        correct = switch (menu) {
        case 1, 2 -> "The restaurant suggests: " + (adult ? "Red wine " : "Cola");

        case 3 -> "The restaurant suggests: " + (adult ? "White wine " : "Lemonade");

        case 4 -> "The restaurant suggests: " + (adult ? "Port wine " : "Still water");

        case 5 -> "The restaurant suggests: Sparkling Water";

        default -> "The restaurant does not have such a menu!";
        };
        System.out.println(correct);
        sc.close();
    }
}