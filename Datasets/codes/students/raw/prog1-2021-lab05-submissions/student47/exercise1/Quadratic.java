package lu.uni.programming1.lab5.exercise1;

public class Quadratic {

    private int a;
    private int b;
    private int c;

    public Quadratic(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public int getDiscriminant(){
        return (b*b)-(4*a*c);
    }

    public double getRoot1(){
        return (-b-Math.sqrt(getDiscriminant()))/2*a;
    }

    public double getRoot2(){
        return (-b+Math.sqrt(getDiscriminant()))/2*a;
    }
}
