package lu.uni.programming1.lab5.exercise1;

public class Quadriatic {
    private int a, b, c;

    Quadriatic(int a, int b, int c) {
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

    public int getDiscriminant() {
        return (b*b)-(4*a*c);
    }

    public double getRoot1() {
        int discriminant = (b*b)-(4*a*c);
        return ((-b)+(Math.sqrt(discriminant)))/2*a;
    }

    public double getRoot2() {
        int discriminant = (b*b)-(4*a*c);
        return ((-b)-(Math.sqrt(discriminant)))/2*a;
    }

   
}