import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Enter a positive integer n: ");
            try {
                n = scanner.nextInt();
                if (n > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
        }

        // Calculate sum using a for loop
        int sumFor = 0;
        for (int i = 1; i <= n; sumFor += i++);
        System.out.println("Sum (for loop): " + sumFor);

        // Calculate sum using a while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) sumWhile += i++;
        System.out.println("Sum (while loop): " + sumWhile);

        // Calculate sum using a do-while loop
        int sumDoWhile = 0;
        int iDo = 1;
        if (n >= 1) {
            do {
                sumDoWhile += iDo++;
            } while (iDo <= n);
        }
        System.out.println("Sum (do-while loop): " + sumDoWhile);

        // Calculate sum using the formula
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum (formula): " + sumFormula);

        // Compare results
        System.out.println("\nComparison:");
        System.out.println("For loop vs. Formula: " + (sumFor == sumFormula ? "Match" : "Mismatch"));
        System.out.println("While loop vs. Formula: " + (sumWhile == sumFormula ? "Match" : "Mismatch"));
        System.out.println("Do-while loop vs. Formula: " + (sumDoWhile == sumFormula ? "Match" : "Mismatch"));

        scanner.close();
    }
}