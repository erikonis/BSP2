import java.util.Scanner;

class Quadratic {
    private double coefficientA;
    private double coefficientB;
    private double coefficientC;

    // Constructor to initialize a, b, and c
    public Quadratic(double a, double b, double c) {
        this.coefficientA = a;
        this.coefficientB = b;
        this.coefficientC = c;
    }

    // Getter methods for a, b, and c
    public double getA() {
        return coefficientA;
    }

    public double getB() {
        return coefficientB;
    }

    public double getC() {
        return coefficientC;
    }

    // Method to get the discriminant
    public double getDiscriminant() {
        return (coefficientB * coefficientB) - (4 * coefficientA * coefficientC);
    }

    // Methods to get the roots
    public double getRoot1() {
        double discriminantValue = getDiscriminant();
        if (discriminantValue < 0) {
            return Double.NaN; // Indicates no real root
        }
        return (-coefficientB + Math.sqrt(discriminantValue)) / (2 * coefficientA);
    }

    public double getRoot2() {
        double discriminantValue = getDiscriminant();
        if (discriminantValue < 0) {
            return Double.NaN; // Indicates no real root
        }
        return (-coefficientB - Math.sqrt(discriminantValue)) / (2 * coefficientA);
    }
}

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c (space-separated): ");
        double aValue = inputReader.nextDouble();
        double bValue = inputReader.nextDouble();
        double cValue = inputReader.nextDouble();
        inputReader.close();

        Quadratic equationSolver = new Quadratic(aValue, bValue, cValue);
        double delta = equationSolver.getDiscriminant();

        if (delta > 0) {
            System.out.println("Two distinct real roots exist:");
            System.out.println("Root 1: " + equationSolver.getRoot1());
            System.out.println("Root 2: " + equationSolver.getRoot2());
        } else if (delta == 0) {
            System.out.println("One real root (repeated root):");
            System.out.println("Root: " + equationSolver.getRoot1());
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}