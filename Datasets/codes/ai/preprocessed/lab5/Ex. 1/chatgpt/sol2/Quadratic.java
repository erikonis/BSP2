public class Quadratic {
    private double a, b, c;

    // Constructor
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to get the discriminant
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // Method to get root1
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Not a number, no real root
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Method to get root2
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN; // Not a number, no real root
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}