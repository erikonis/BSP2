import java.util.Scanner;

public class Quadratic {
    private double a;
    private double b;
    private double c;

    // Constructor to initialize coefficients
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    // Calculate discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Calculate first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Calculate second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }

    // Test program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficients a b c (separate them with a space): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

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

        input.close();
    }
}