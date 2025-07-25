public package ex1;

import java.util.Scanner;

public class XtoY {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter y: ");
        double y = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();

        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
} {

}