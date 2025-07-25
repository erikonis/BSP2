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

    // Getters
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    // Discriminant: b² - 4ac
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // First root
    public double getRoot1() {
        double d = getDiscriminant();
        if (d < 0) return Double.NaN;
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    // Second root
    public double getRoot2() {
        double d = getDiscriminant();
        if (d < 0) return Double.NaN;
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}