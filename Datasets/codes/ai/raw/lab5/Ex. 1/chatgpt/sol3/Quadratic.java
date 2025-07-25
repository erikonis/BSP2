public class Quadratic {
    private double a, b, c;

    // Constructor to initialize a, b, and c
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Method to get the discriminant: b^2 - 4ac
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // Method to get the first root
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN;
        }
        return (-b + Math.sqrt(discriminant)) / (2 * a);
    }

    // Method to get the second root
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return Double.NaN;
        }
        return (-b - Math.sqrt(discriminant)) / (2 * a);
    }
}
