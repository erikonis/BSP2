public package exercise1;

import java.util.Scanner;

public class XtoYWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();

        printNumbers(x, y, d);
    }

    public static void printNumbers(double x, double y, double d) {
        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
} {

}