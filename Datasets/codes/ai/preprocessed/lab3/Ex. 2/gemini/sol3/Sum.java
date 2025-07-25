import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Keep asking until a positive integer is entered
        do {
            System.out.print("Enter a positive integer n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // consume the invalid input
                System.out.print("Enter a positive integer n: ");
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
            }
        } while (n <= 0);

        // Calculate sum using a for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        // Calculate sum using a while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        // Calculate sum using a do-while loop
        int sumDoWhile = 0;
        int j = 1;
        do {
            sumDoWhile += j;
            j++;
        } while (j <= n);
        System.out.println("Sum using do-while loop: " + sumDoWhile);

        // Calculate sum using the formula
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using formula: " + sumFormula);

        // Compare the results
        if (sumFor == sumWhile && sumWhile == sumDoWhile && sumDoWhile == sumFormula) {
            System.out.println("\nAll three loop calculations and the formula result in the same sum.");
        } else {
            System.out.println("\nThere is a discrepancy between the results.");
            if (sumFor != sumFormula) System.out.println("For loop result differs.");
            if (sumWhile != sumFormula) System.out.println("While loop result differs.");
            if (sumDoWhile != sumFormula) System.out.println("Do-while loop result differs.");
        }

        scanner.close();
    }
}