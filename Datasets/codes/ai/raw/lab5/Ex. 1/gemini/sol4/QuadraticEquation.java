import java.util.Scanner;

class Quadratic {
    private double a;
    private double b;
    private double c;

    // 1. Constructor to initialize a, b, and c
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // 2. Getter methods for a, b, and c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // 3. Method to get the discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // 4. Methods to get the roots
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Not a Number, indicating no real root
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Not a Number, indicating no real root
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space) : ");
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
            System.out.println("The equation has no real roots!");
        }
    }
}