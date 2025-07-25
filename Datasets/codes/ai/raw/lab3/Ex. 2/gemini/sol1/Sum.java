package lab03.Ex. 2.gemini.sol1;

public package ex2;

import java.util.Scanner;

public class Sum {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter a positive integer n: ");
            n = input.nextInt();
        } while (n <= 0);

        // For loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println("Sum (for loop): " + sumFor);

        // While loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum (while loop): " + sumWhile);

        // Do-while loop
        int sumDoWhile = 0;
        i = 1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);
        System.out.println("Sum (do-while loop): " + sumDoWhile);

        // Formula
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum (formula): " + sumFormula);
    }
} {
    
}
