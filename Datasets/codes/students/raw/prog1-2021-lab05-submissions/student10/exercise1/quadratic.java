package src.lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Quadratic {
    private static double coefa;
    private static double coefb;
    private static double coefc;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values for a:");
        coefa = scanner.nextDouble();

        System.out.println("Enter value for b:");
        coefb = scanner.nextDouble();

        System.out.println("Entre values for a:");
        coefc = scanner.nextDouble();
           

        scanner.close();

        double discriminant = getDiscriminant();

        if(discriminant < 0){
            System.out.println("The equation has no roots!");
        }
        else if(discriminant == 0){
            System.out.println("there is one root:" + getRoot1());
        }
        else{
            System.out.println("There are two roots:");
            System.out.println("Root1: " + getRoot1());
            System.out.println("Root2: " + getRoot2());
        }
    }

    public void QuadraticEquation(double a, double b, double c) {   

        coefa = a;
        coefb = b;
        coefc = c;
    }
    private static double getDiscriminant() {
        double discriminant = (coefb * coefb) - (4 * coefa * coefc);
        return discriminant;
    }
    static double getRoot1(){
        double root1 = (-coefb + Math.sqrt(getDiscriminant()))/(2*coefa);
        return root1;
    }
    static double getRoot2(){
        double root2 = (-coefb - Math.sqrt(getDiscriminant()))/(2*coefa);
        return root2;
    }
}
