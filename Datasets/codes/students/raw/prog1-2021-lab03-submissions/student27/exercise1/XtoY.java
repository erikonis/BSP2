package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        double x = scanner.nextDouble();

        System.out.print("Enter second value: ");
        double y = scanner.nextDouble();

        System.out.print("Enter step: ");
        double d = scanner.nextDouble();

        if (x < y) {
            for (Double i = x; i < y; i += d) {
                System.out.format("%f\n", i);
            }
        } else {
            for (Double i = x; i > y; i -= d) {
                System.out.format("%f\n", i);
            }
        }

        scanner.close();
    }
}
