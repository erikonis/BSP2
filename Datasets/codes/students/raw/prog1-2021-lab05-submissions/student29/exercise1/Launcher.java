package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Asks the user for a, b and c
        System.out.print("Please enter the coefficients a b c (seperate them with a space): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Quadratic equation = new Quadratic(a, b, c);

        if (equation.getDiscriminant() == 0) {
            System.out.println("There is one root: " + equation.getRoot1());
        } else if (equation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots!");
        } else {
            System.out.println("There are two roots:\nRoot1: " + equation.getRoot1() + "\nRoot2: " + equation.getRoot2());
        }

        scanner.close();
    }
}
