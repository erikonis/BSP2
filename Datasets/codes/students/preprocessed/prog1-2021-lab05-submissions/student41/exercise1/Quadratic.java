public class Quadratic {

    private int a, b, c;

    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getRoot1() {

        double squareroot1 = Math.pow((b * b - 4 * a * c), 0.5);

        double root1 = (-b + squareroot1) / (2 * a);

        return root1;
    }

    public double getRoot2() {

        double squareroot2 = Math.pow((b * b - 4 * a * c), 0.5);

        double root2 = (-b - squareroot2) / (2 * a);

        return root2;
    }

    public int getDiscriminant() {

        int discriminant = b * b - 4 * a * c;

        return discriminant;
    }

    public void reset() {
        a = b = c = 0;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
    
}
