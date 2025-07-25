package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args){
        float X, Y, d, i;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please give the first integer number: ");
        X = scan.nextFloat();

        System.out.print("Please give the last integer number: ");
        Y = scan.nextFloat();

        System.out.print("Please enter the steps from one number to another: ");
        d = scan.nextFloat();

        scan.close();

        for ( i = X; i <= Y; i+=d){
            System.out.printf("\n %.2f",i);
        }
        
    }
}
