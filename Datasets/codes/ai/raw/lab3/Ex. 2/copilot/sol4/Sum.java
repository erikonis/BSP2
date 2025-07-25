import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Prompt the user until a positive integer is entered
        do {
            System.out.println("Enter a positive integer:");
            n = scanner.nextInt();
        } while (n <= 0);

        // Calculate sum using a for loop
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // Calculate sum using a while loop
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        // Calculate sum using a do-while loop
        int sumDoWhile = 0;
        i = 1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);

        // Calculate sum using the formula
        int sumFormula = n * (n + 1) / 2;

        // Print the results
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using while loop: " + sumWhile);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare the results
        if (sumFor == sumWhile && sumWhile == sumDoWhile && sumDoWhile == sumFormula) {
            System.out.println("All methods produce the same result.");
        } else {
            System.out.println("There is a discrepancy between the methods.");
        }
    }
}
