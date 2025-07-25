import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the value of n (the number of terms)
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Check for valid input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initialize the first two terms of the sequence
        int K1 = 1, K2 = 1;
        System.out.print("K1 = 1, K2 = 1");

        // Variable to store the current term
        int currentTerm = 0;

        // Loop to calculate the subsequent terms
        for (int i = 3; i <= n; i++) {
            // Calculate the nth term
            currentTerm = (K2 - 1) + (K1 * 2);

            // Print the current term in the desired format
            System.out.print(", K" + i + " = " + currentTerm);

            // Update K1 and K2 for the next iteration
            K1 = K2;
            K2 = currentTerm;
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
