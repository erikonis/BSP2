package lu.uni.programming1.lab5.exercise1;

public class Quadratic {
    private int a, b, c;

    Quadratic(int a_, int b_, int c_) {
        this.a = a_;
        this.b = b_;
        this.c = c_;
    }

    public int geta() {
        return a;
    }

    public int getb() {
        return b;
    }

    public int getc() {
        return c;
    }


    public int getDiscriminant() {
        int D = (b*b)-(4*a*c);
        return D;
    }

    public double getRoot1() {
        double root1 = (-b+ Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return root1;
    }

    public double getRoot2() {
        double root2 = (-b- Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return root2;
    }

}
