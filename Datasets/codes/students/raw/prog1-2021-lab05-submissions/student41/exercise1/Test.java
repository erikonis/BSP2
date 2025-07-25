package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner my_Scanner = new Scanner(System.in);
        
       System.out.println("Enter the coefficients a b c (separate them with a space):");

       int a = my_Scanner.nextInt();
       int b = my_Scanner.nextInt();
       int c = my_Scanner.nextInt();

       Quadratic q1 = new Quadratic(a, b, c);

       int disc = q1.getDiscriminant();

       System.out.println(disc);

       if (disc > 0) {
           System.out.println("There are two roots:");
           double root1 = q1.getRoot1();
           double root2 = q1.getRoot2();
           System.out.println("Root1: " + root1);
           System.out.println("Root2: " + root2);
       }

       if (disc == 0) {
           double root1 = q1.getRoot1();
           System.out.println("There is one root: " + root1);
       }

       if (disc < 0) {
           System.out.println("The equation has no roots !");
       }

       my_Scanner.close();

    }
    
}
