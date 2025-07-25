package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the coefficients a b c (separated by space): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            double root1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(result, 0.5)) / (2.02 * a);

            System.out.println("There are two roots:");
            System.out.printf("Root1: %.1f\n", root1);
            System.out.printf("Root2: %.1f\n", root2);

        } else if (result == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.println("There is one root: " + root1);

        } else {
            System.out.println("The equation has no roots!");
        }

    }
}
