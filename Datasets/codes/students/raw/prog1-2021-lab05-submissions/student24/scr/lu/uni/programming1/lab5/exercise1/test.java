package scr.lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class test {
    static Quadratic q;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for a b c (separate them with a space): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        q = new Quadratic(a, b, c);
        if(q.getDiscriminant() > 0){
            System.out.println("Root1: " + q.getRoot1());
            System.out.println("Root2: " + q.getRoot2());
        }else if(q.getDiscriminant() == 0){
            System.out.println("There is one root: " + q.getRoot1());
        }else{
            System.out.println("The equation has no root");
        }

        sc.close();
    }
}
