import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of terms (n) in the sequence
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Validate input to ensure n is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
            return;
        }

        // Handle base cases directly
        if (n == 1) {
            System.out.println("K1 = 1");
            return;
        } else if (n == 2) {
            System.out.println("K1 = 1, K2 = 1");
            return;
        }

        // Initialize the first two terms of the Kellacci sequence
        int K1 = 1, K2 = 1;

        // Output the first two terms
        System.out.print("K1 = 1, K2 = 1");

        // Loop through the sequence from 3 to n to calculate the terms
        int currentTerm = 0;
        for (int i = 3; i <= n; i++) {
            // Apply the Kellacci formula to find the next term
            currentTerm = (K2 - 1) + (K1 * 2);

            // Print the current term
            System.out.print(", K" + i + " = " + currentTerm);

            // Update K1 and K2 for the next iteration
            K1 = K2;
            K2 = currentTerm;
        }

        // Close the scanner
        scanner.close();
    }
}