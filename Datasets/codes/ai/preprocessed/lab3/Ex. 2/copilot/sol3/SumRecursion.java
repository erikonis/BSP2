public package exercise2;

import java.util.Scanner;

public class SumRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int sumRecursion = sum(n);
        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + formulaSum);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}