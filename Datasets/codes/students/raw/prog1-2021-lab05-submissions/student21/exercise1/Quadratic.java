package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Quadratic{
    private static int a, b, c;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value for :");
        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
        System.out.println("c = ");
        c = sc.nextInt();
        sc.close();
        if(getDiscriminant()<0){
            System.out.println("The discriminant is negative, this equation has no solution !");
        }
        else if(getDiscriminant()==0){
            System.out.println("The discriminant is 0, there is olny one solution.");
            double sol = (-b)/(2*a);
            System.out.println("The only solution is : "+sol);
        }
        else{
            System.out.println("The discriminant is positive, there are 2 solutions.");
            System.out.println("The first solution is : " + getRoot1());
            System.out.println("The second soolution is : "+ getRoot2());
        }
    }

    public Quadratic(int pA, int pB, int pC){
        a = pA;
        b = pB;
        c = pC;
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static int getC() {
        return c;
    }

    public static double getDiscriminant(){
        return (Math.pow(b, 2)-4*a*c);
    }

    public static double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/2*a;
    }
    public static double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/2*a;
    }
}