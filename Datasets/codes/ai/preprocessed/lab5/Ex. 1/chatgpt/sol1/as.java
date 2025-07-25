public package exercise1;

import java.util.Scanner;

class Quadratic {
    private double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public Double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) return null;
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public Double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) return null;
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}

public class QuadraticTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        scanner.close();

        Quadratic equation = new Quadratic(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + equation.getRoot1());
            System.out.println("Root2: " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("There is one root: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }
    }
}