package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input the x number: ");

         double x = scanner.nextDouble();

        System.out.print("Please input the y number: ");

         double y = scanner.nextDouble();

        System.out.print("Please input the d number: ");

         double d = scanner.nextDouble();

        
        for (double XtoY = x; XtoY <= y; XtoY += d ) {
            System.out.println(XtoY);
        }
        
    scanner.close();
    }
}
