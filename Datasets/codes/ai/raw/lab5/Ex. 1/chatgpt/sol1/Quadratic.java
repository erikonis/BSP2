// Quadratic.java

class Quadratic {
    private double a, b, c;

    // Constructor
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    // Method to calculate the discriminant
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    // Method to calculate root 1
    public double getRoot1() {
        if (getDiscriminant() < 0) return Double.NaN;
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    // Method to calculate root 2
    public double getRoot2() {
        if (getDiscriminant() < 0) return Double.NaN;
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}
