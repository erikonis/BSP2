package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class QuadraticMain {

    public static void main(String[] args) {
    
    double a ;
    double b ;
    double c ;
   
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Enter the coefficients a b c (separate with a space) : ");
    a = scanner.nextDouble();
    b = scanner.nextDouble();
    c = scanner.nextDouble();

    Quadratic x = new Quadratic(a, b, c);
    

    if (x.getDiscriminant()>0){
        System.out.println( "There are two roots : ");
        System.out.println( "Root1:" + x.getRoot1() );
        System.out.println( "Root1:" + x.getRoot2() );
    }

    if (x.getDiscriminant()==0){
        System.out.println( "There are two roots : ");
        System.out.println( "There is one root:" + x.getRoot1() );
    }

    if (x.getDiscriminant()<0){
        System.out.println( "The equation has no roots !");
    }


    scanner.close();


    }
    

}
