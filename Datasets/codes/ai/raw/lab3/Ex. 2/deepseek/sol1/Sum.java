package exercise2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Keep asking until a positive integer is entered
        do {
            System.out.print("Enter a positive integer: ");
            n = scanner.nextInt();
        } while (n <= 0);

        // Calculate sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Calculate sum using while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Calculate sum using do-while loop
        int sumDoWhile = 0;
        i = 1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);

        // Compare results with the formula
        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
        System.out.println("Sum using formula: " + formulaSum);
    }
}