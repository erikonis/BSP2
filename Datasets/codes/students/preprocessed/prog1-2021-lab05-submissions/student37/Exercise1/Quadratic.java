import java.lang.Math;

public class Quadratic {

    private double a,b,c;

    Quadratic(double a, double b, double c ) {
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public double getA() {return a; }
    public double getB() {return b; }
    public double getC() {return c; }

    public static double getDiscriminant(double a, double b, double c) {
        double discriminant = ((b*b) - (4*a*c));
                
        return discriminant;}

    public static double getRoot1(double a, double b, double c) {

        double root1= (  ((-b)*((1))/(2*a)   ) + ( (Math.sqrt(getDiscriminant(a,b,c)))  / (2*a) ));

        return root1; }

    public static double getRoot2(double a, double b, double c) {

        double root2= (  ((-b)*((1)/(2*a))) - ( (Math.sqrt(getDiscriminant(a,b,c))) /   (2*a)  ));

        return root2; }

}