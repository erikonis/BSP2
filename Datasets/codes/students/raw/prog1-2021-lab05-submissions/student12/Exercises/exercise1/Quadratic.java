package Exercises.exercise1;

import java.util.Scanner;

public class Quadratic
{
    public Quadratic(int pA, int pB, int pC)
    {
        a = pA;
        b = pB;
        c = pC;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please put in a number a: ");
        a = s.nextInt();

        System.out.println("Please put in a number b: ");
        b = s.nextInt();

        System.out.println("Please put in a number c: ");
        c = s.nextInt();
        s.close();

        if(getDiscriminant() >0)
        {
            System.out.println("This equation has two roots, which are: "
            + getRoot1() + " and " + getRoot2());
        }
        else if(getDiscriminant() ==0)
        {
            System.out.println("This equation has only one root, which is: " + getRoot1());
        }
        else
        {
            System.out.println("The equation has no root.");
        }
    }

    public static int a;
    public static int b;
    public static int c;

    

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public int getC()
    {
        return c;
    }

    public static double getDiscriminant()
    {
        double number = Math.pow(b, 2) - 4*a*c;
        return number;
    }

    public static double getRoot1()
    {
        double top = -b + Math.sqrt(getDiscriminant());
        double bottom = 2*a;
        return top/bottom;
    }

    public static double getRoot2()
    {
        double top = -b - Math.sqrt(getDiscriminant());
        double bottom = 2*a;
        return top/bottom;
    }
}