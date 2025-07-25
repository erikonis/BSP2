package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class XToY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double d = scanner.nextDouble();

        for (double i = x; i <= y; i += d)
            System.out.format("%.1f%n", i);

        scanner.close();
    }
}