public class quadratic {
    private double a, b, c;

    public quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    private double getRoot1() {
        return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }

    private double getRoot2() {
        return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public void getRoots() {
        double d = getDiscriminant();
        if (d > 0) { // we have 2 roots
            System.out.println("There are two roots: ");
            System.out.println(getRoot1());
            System.out.println(getRoot2());
        } else if (d == 0) { // we have one single root
            System.out.println("There is one root: ");
            System.out.println(getRoot1());
        } else { // We have no roots
            System.out.println("The equation has no roots!!");
        }
    }
}