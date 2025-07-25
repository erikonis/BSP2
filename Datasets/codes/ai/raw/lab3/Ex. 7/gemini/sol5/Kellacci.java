import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the desired term number (n): ");
        int n = console.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for the term number.");
            console.close();
            return;
        }

        int termMinus2 = 1; // K1
        int termMinus1 = 1; // K2

        System.out.print("Kellacci sequence up to K" + n + ": ");

        if (n >= 1) {
            System.out.print(termMinus2);
        }
        if (n >= 2) {
            System.out.print(", " + termMinus1);
        }

        for (int i = 3; i <= n; i++) {
            int currentTerm = (termMinus1 - 1) + (termMinus2 * 2);
            System.out.print(", " + currentTerm);
            termMinus2 = termMinus1;
            termMinus1 = currentTerm;
        }
        System.out.println();
        console.close();
    }
}