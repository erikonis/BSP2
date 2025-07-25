package ex1;

import java.util.Scanner;

public class quadratic {
    private static Double a;
    private static Double b;
    private static Double c;
    private static Double d;
 
    // coefficients
    public quadratic() {
        System.out.println("quadratic fonction ax^2+bx+c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("coefficients : ");
        quadratic.a = scanner.nextDouble();
        quadratic.b = scanner.nextDouble();
        quadratic.c = scanner.nextDouble();
        scanner.close();
    }
    // equation
    public void affiche() {
        System.out.println("the equation is : "+a+"x^2 + "+b+"x + "+c );
    }
    //discriminant
    public static Double getdiscriminant() {
        d = b*b-4*a*c;
        System.out.println("the discriminant is "+d);
        return d;
    }
    public static void root1() {
        Double root1Double = 0.0;
        if (d>0) {
            root1Double = -b+(Math.sqrt(d))/2*a;
            System.out.println(root1Double);

        } else if (d==0)  {
            root1Double = -b/2*a;
            System.out.println(root1Double);
        }
        else {
            System.out.println("the equation has no roots");
        }
    }
    public static void root2() {
        Double root2Double = 0.0;
        if (d>0) {
            root2Double = -b+(Math.sqrt(d))/2*a;
            System.out.println(root2Double);
        } else if (d==0)  {
            root2Double = -b/2*a;
            System.out.println(root2Double);
        }
        else {
        }
        
    }
 
    // méthode principale (main)
    public static void main(String args[]) {
        quadratic p = new quadratic();
        p.affiche();
        getdiscriminant();
        root1();
        root2();
        
    }

}
