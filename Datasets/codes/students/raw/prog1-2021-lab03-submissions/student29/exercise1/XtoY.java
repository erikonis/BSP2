package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x,y,d;
        System.out.print("Enter starting decimal number: ");
        x = scanner.nextDouble();
        System.out.print("Enter ending decimal number: ");
        y = scanner.nextDouble();
        System.out.print("Enter number of steps: ");
        d = scanner.nextDouble();
        scanner.close();

        for (double i = x; i <= y; i += d) {
            System.out.printf("%.2f\n", i);
        }
    }
}
