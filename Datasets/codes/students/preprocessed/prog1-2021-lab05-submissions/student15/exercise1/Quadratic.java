public class Quadratic {
    
    private double a;
    private double b;
    private double c;

    public Quadratic(double a, double b, double c) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    public double getDiscrimant() {
        return b*b-4.0*a*c;
    }

    public double getRoot1() {
        return ((-b+Math.sqrt(getDiscrimant()))/(2*a));
    }

    public double getRoot2() {
        return ((-b-Math.sqrt(getDiscrimant()))/(2*a));
    }
}

    