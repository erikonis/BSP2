public class ComplexQuadratic extends Quadratic {
    public ComplexQuadratic(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double[] getRoots() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            // Handle complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            return new double[]{realPart, imaginaryPart}; // Representing complex roots
        }
        return super.getRoots(); // Use parent class logic for real roots
    }
}