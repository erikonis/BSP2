public class Complex {
    private double real;
    private double imag;

    public Complex(double real) {
        this(real, 0);
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag == 0) {
            return String.valueOf(real);
        } else if (imag > 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }
}