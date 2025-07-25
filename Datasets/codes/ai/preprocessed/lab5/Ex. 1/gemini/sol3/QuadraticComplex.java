public class QuadraticComplex {
    // ... (same as Quadratic.java, but with getRoot1 and getRoot2 modified)

    public Complex getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return new Complex((-b + Math.sqrt(discriminant)) / (2 * a));
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-discriminant) / (2 * a);
            return new Complex(real, imag);
        }
    }

    public Complex getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0) {
            return new Complex((-b - Math.sqrt(discriminant)) / (2 * a));
        } else {
            double real = -b / (2 * a);
            double imag = -Math.sqrt(-discriminant) / (2 * a);
            return new Complex(real, imag);
        }
    }
}