package exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();

        for (double i = x; i <= y; i += d) {
            System.out.println(i);
        }
    }
}