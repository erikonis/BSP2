public class QuadraticOptimized {
    private double a;
    private double b;
    private double c;

    public QuadraticOptimized(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double[] getRoots() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return new double[]{Double.NaN, Double.NaN};
        }
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{root1, root2};
    }
}