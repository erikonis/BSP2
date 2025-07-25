public class Quadratic {
    private double a, b, c; // attributes

    Quadratic(double a, double b, double c) { // constructor
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { // getter method
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / 2 * a;
    }
}
