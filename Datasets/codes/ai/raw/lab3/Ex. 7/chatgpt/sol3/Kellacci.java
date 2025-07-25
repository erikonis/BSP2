import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value for n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Handling edge case when n is less than 1
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        // Variables to store the previous two terms of the sequence
        int K1 = 1, K2 = 1;

        // Handle the first two terms of the sequence
        if (n >= 1) {
            System.out.print("K1 = 1");
        }
        if (n >= 2) {
            System.out.print(", K2 = 1");
        }

        // Variables for the current term
        int currentTerm = 0;

        // Calculate and print the terms from K3 to Kn
        for (int i = 3; i <= n; i++) {
            currentTerm = (K2 - 1) + (K1 * 2);
            System.out.print(", K" + i + " = " + currentTerm);

            // Update K1 and K2 for the next iteration
            K1 = K2;
            K2 = currentTerm;
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
