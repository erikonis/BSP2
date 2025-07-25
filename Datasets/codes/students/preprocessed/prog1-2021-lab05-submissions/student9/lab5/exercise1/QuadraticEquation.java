import java.util.Scanner;

public class QuadraticEquation {

    double a,b,c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminate() {
        return b*b-4*a*c;
    }

    public double getRoot1() {
        return (-b+Math.sqrt(getDiscriminate()))/(2*a);
    }

    public double getRoot2() {
        return (-b-Math.sqrt(getDiscriminate()))/(2*a);
    }
    
    public static void main(String[] args) {

        double a,b,c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coefficients a b c (separate them with a space) : ");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        System.out.println("\t"+qe.getA()+" x² + "+qe.getB()+" x + "+qe.getC()+" = 0");

        if(qe.getDiscriminate()>0){
            System.out.println("There are two roots");
            System.out.println("\tRoot 1: "+qe.getRoot1());
            System.out.println("\tRoot 2: "+qe.getRoot2());
        }
        else if(qe.getDiscriminate()==0){
            System.out.println("There is one root");
            System.out.println("\tRoot : "+qe.getRoot1());
        }
        else 
            System.out.println("The equation has no roots");


        scanner.close();
    }
}
