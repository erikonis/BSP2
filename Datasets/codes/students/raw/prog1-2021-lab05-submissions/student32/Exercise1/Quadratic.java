package Exercise1;

import java.util.Scanner;

public class Quadratic {
    //main
    public static void main(String[] args) {
        //scanner 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients a b c (separate them with a space) :");
        Quadratic q = new Quadratic(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        if(q.getDiscriminant()>0)
        {
            System.out.println("There are two roots:");
            System.out.println("Root1: " + q.getRoot1());
            System.out.println("Root2: " + q.getRoot2());
        }
        if(q.getDiscriminant()<0)
        {
            System.out.println("The equation has no roots!");
        }
        if(q.getDiscriminant()==0)
        {
            System.out.println("There is one root:");
            System.out.println("Root1: " + q.getRoot1());
        }
        
        

        //close
        scanner.close();
    }

    //attribute

    private int a,b,c;

    //constructor

    public Quadratic(int a, int b, int c){
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
    public int getDiscriminant(){
        return (b*b)-(4*a*c);
    }
    public double getRoot1(){
        double denominator = -b + Math.sqrt(getDiscriminant());
        double divisor = 2*a;
        return (denominator/divisor);
    }
    public double getRoot2(){
        double denominator = -b - Math.sqrt(getDiscriminant());
        double divisor = 2*a;
        return (denominator/divisor);
    }
    
}
