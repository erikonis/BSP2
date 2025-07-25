import java.util.Scanner;
import java.util.InputMismatchException;

public class SumCalculator {

    public static void main(String[] args) {
        int n = getPositiveInteger();
        compareSumMethods(n);
    }

    private static int getPositiveInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a positive integer: ");
                number = scanner.nextInt();

                if (number > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number greater than 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();
        return number;
    }

    private static void compareSumMethods(int n) {
        long sumFor = calculateSumWithForLoop(n);
        long sumWhile = calculateSumWithWhileLoop(n);
        long sumDoWhile = calculateSumWithDoWhileLoop(n);
        long sumFormula = calculateSumWithFormula(n);

        System.out.printf("%-15s: %d%n", "For loop", sumFor);
        System.out.printf("%-15s: %d%n", "While loop", sumWhile);
        System.out.printf("%-15s: %d%n", "Do-while loop", sumDoWhile);
        System.out.printf("%-15s: %d%n", "Formula", sumFormula);

        if (sumFor == sumWhile && sumWhile == sumDoWhile && sumDoWhile == sumFormula) {
            System.out.println("\nAll calculation methods agree!");
        } else {
            System.out.println("\nDiscrepancy detected in calculations!");
        }
    }

    private static long calculateSumWithForLoop(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static long calculateSumWithWhileLoop(int n) {
        long sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    private static long calculateSumWithDoWhileLoop(int n) {
        long sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        return sum;
    }

    private static long calculateSumWithFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}