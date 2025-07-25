package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x,y,d;

        System.out.print("Please enter the value for x: ");
        x=scanner.nextDouble();
        System.out.print("Please enter the value for y: ");
        y=scanner.nextDouble();
        System.out.print("Please enter the value for d: ");
        d=scanner.nextDouble();
        
        for (double i=x; i<=y; i+=d) {System.out.printf("\n%.1f",i); 
            scanner.close();}

        
}
    
}
