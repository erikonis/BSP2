import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = getPositiveInteger(scanner);

        // Calculate sum using a for loop
        int sumFor = calculateSumFor(n);
        System.out.println("Sum (for loop): " + sumFor);

        // Calculate sum using a while loop
        int sumWhile = calculateSumWhile(n);
        System.out.println("Sum (while loop): " + sumWhile);

        // Calculate sum using a do-while loop
        int sumDoWhile = calculateSumDoWhile(n);
        System.out.println("Sum (do-while loop): " + sumDoWhile);

        // Calculate sum using the formula
        int sumFormula = calculateSumFormula(n);
        System.out.println("Sum (formula): " + sumFormula);

        // Compare results
        compareResults(sumFor, sumWhile, sumDoWhile, sumFormula);

        scanner.close();
    }

    // Method to repeatedly get a positive integer from the user
    private static int getPositiveInteger(Scanner scanner) {
        int num;
        do {
            System.out.print("Enter a positive integer n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (num <= 0);
        return num;
    }

    // Method to calculate sum using a for loop
    private static int calculateSumFor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; sum += i++);
        return sum;
    }

    // Method to calculate sum using a while loop
    private static int calculateSumWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) sum += i++;
        return sum;
    }

    // Method to calculate sum using a do-while loop
    private static int calculateSumDoWhile(int n) {
        int sum = 0;
        int i = 1;
        if (n >= 1) {
            do {
                sum += i++;
            } while (i <= n);
        }
        return sum;
    }

    // Method to calculate sum using the formula
    private static int calculateSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    // Method to compare and display the results
    private static void compareResults(int sumFor, int sumWhile, int sumDoWhile, int sumFormula) {
        System.out.println("\nComparison:");
        System.out.println("For loop vs. Formula: " + (sumFor == sumFormula ? "Match" : "Mismatch"));
        System.out.println("While loop vs. Formula: " + (sumWhile == sumFormula ? "Match" : "Mismatch"));
        System.out.println("Do-while loop vs. Formula: " + (sumDoWhile == sumFormula ? "Match" : "Mismatch"));
    }
}