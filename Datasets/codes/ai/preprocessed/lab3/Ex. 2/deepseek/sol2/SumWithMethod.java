public package exercise2;

import java.util.Scanner;

public class SumWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Keep asking until a positive integer is entered
        do {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int sumFor = calculateSumFor(n);
        int sumWhile = calculateSumWhile(n);
        int sumDoWhile = calculateSumDoWhile(n);
        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
        System.out.println("Sum using formula: " + formulaSum);
    }

    public static int calculateSumFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int calculateSumWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static int calculateSumDoWhile(int n) {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        return sum;
    }
} {

}