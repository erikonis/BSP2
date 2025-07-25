package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the starting number :");
        double x = scanner.nextDouble();
        System.out.println("Please enter the ending number :");
        double y = scanner.nextDouble();
        System.out.println("Please enter the steps :");
        double d = scanner.nextDouble();
        while(x<=y){
            System.out.println(x);
            x += d;
        }
        scanner.close();
    }
}
