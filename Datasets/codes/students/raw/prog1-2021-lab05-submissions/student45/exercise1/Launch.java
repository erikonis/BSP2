package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter coefficients a b c (separate them with a space) : ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        Quadratic quadratic = new Quadratic(a, b, c);

        if(quadratic.getDiscriminant()>0) {System.out.println("There are two roots : \n Root1: "+quadratic.getRoot1()+"\n Root2 : "+quadratic.getRoot2());}
        else if(quadratic.getDiscriminant()==0) {System.out.println("There is one root : "+quadratic.getRoot1());}
        else {System.out.println("The equation has no roots!");};

        scanner.close();
    }
}
