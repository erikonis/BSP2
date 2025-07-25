package exercise1;

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

    // Method to calculate discriminant
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Method to calculate root1
    public double getRoot1() {
        double discriminant = getDiscriminant();
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Method to calculate root2
    public double getRoot2() {
        double discriminant = getDiscriminant();
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}