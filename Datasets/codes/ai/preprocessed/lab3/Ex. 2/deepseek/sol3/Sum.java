import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Keep asking until positive integer is entered
        do {
            System.out.print("Enter a positive integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not an integer!");
                scanner.next(); // discard non-integer input
                System.out.print("Enter a positive integer: ");
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Calculate sum using for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Calculate sum using while loop
        int sumWhile = 0;
        int j = 1;
        while (j <= n) {
            sumWhile += j;
            j++;
        }

        // Calculate sum using do-while loop
        int sumDoWhile = 0;
        int k = 1;
        do {
            sumDoWhile += k;
            k++;
        } while (k <= n);

        // Calculate using formula
        int sumFormula = n * (n + 1) / 2;

        // Print results
        System.out.println("\nSum using for loop: " + sumFor);
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
        System.out.println("Sum using formula: " + sumFormula);

        // Verify all methods give same result
        if (sumFor == sumWhile && sumWhile == sumDoWhile && sumDoWhile == sumFormula) {
            System.out.println("\nAll methods agree on the sum!");
        } else {
            System.out.println("\nError: Calculation methods disagree!");
        }

        scanner.close();
    }
}