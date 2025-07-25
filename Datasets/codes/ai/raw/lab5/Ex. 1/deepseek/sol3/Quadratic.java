package exercise1;

public class Quadratic {
    public static double getDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static double[] getRoots(double a, double b, double c) {
        double discriminant = getDiscriminant(a, b, c);
        if (discriminant < 0) {
            return null; // No real roots
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{root1, root2};
    }
}