package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Quadratic {

    private static double coefA;
    private static double coefB;
    private static double coefC;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients a b c (separate them with a space): ");
        coefA = scanner.nextDouble();
        coefB = scanner.nextDouble();
        coefC = scanner.nextDouble();

        double discriminant = getDiscriminant();

        if(discriminant < 0) {
            System.out.println("The equation has no roots!");
        } else if (discriminant == 0) {
            System.out.println("There is one root: " + getRoot1());
        } else {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + getRoot1());
            System.out.println("Root2: " + getRoot2());
        }
        scanner.close();
    }
    
    // Construct
    public Quadratic(double a, double b, double c) {
        coefA = a;
        coefB = b;
        coefC = c;
    }

    private static double getDiscriminant() {
        double discriminant = (coefB * coefB) - (4 * coefA * coefC);
        return discriminant;
    }
    static double getRoot1() {
        double root1 = (-coefB + Math.sqrt(getDiscriminant())) / (2 * coefA);
        return root1;
    }
    static double getRoot2() {
        double root2 = (-coefB - Math.sqrt(getDiscriminant())) / (2 * coefA);
        return root2;

    }
}
