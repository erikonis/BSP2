import java.util.Scanner;

public class Quadratic {
    private double a;
    private double b;
    private double c;

    // Constructor to initialize the coefficients
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods for a, b, and c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to calculate the discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to calculate the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        } else {
            return Double.NaN; // Not a Number, indicating no real root
        }
    }

    // Method to calculate the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            return Double.NaN; // Not a Number, indicating no real root
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

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
