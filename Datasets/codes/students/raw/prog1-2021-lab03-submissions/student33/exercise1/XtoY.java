package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Y = ");
        double Y = scanner.nextDouble();
        System.out.print(" D = ");
        double D = scanner.nextDouble();
        System.out.print("X = ");
        for(double X = scanner.nextDouble(); X <= Y ; X+=D  ) {
          System.out.printf("%.3f \n" , X);


        }

        scanner.close();
        
    }
    
}
