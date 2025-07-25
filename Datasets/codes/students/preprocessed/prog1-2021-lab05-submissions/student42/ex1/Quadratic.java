public class Quadratic {
    private double a, b, c;

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // GETTERS:
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Calculates and returns the discriminant
    public double getDiscriminant() {
        double d = b * b - 4.0 * a * c;
        return d;
    }

    // Returns the 1st root of the equation
    public double getRoot1() {
        return (-b + Math.sqrt(this.getDiscriminant())) / (2.0 * a);
    }

    // Returns the 2nd root of the equation
    public double getRoot2() {
        return (-b - Math.sqrt(this.getDiscriminant())) / (2.0 * a);
    }

}