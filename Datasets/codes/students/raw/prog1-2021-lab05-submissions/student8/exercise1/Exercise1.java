package lu.uni.programming1.lab5.exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        quadratic equal = new quadratic(a, b, c);
        equal.getRoots();
        scanner.close();
    }
}