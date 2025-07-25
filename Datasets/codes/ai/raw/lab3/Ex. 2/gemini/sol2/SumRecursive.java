package ex2;

import java.util.Scanner;

public class SumRecursive {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a positive integer n: ");
            n = input.nextInt();
        } while (n <= 0);

        System.out.println("Sum (recursive): " + sumRecursive(n));

        // Formula
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum (formula): " + sumFormula);
    }

    private static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
}