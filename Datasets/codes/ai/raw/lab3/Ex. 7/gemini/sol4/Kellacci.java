import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the integer n: ");
        int n = keyboard.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            keyboard.close();
            return;
        }

        int prevPrev = 1; // Represents K(n-2)
        int prev = 1;    // Represents K(n-1)

        System.out.print("Kellacci sequence up to K" + n + ": ");

        if (n >= 1) {
            System.out.print(prevPrev);
        }
        if (n >= 2) {
            System.out.print(", " + prev);
        }

        for (int i = 3; i <= n; i++) {
            int current = (prev - 1) + (prevPrev * 2);
            System.out.print(", " + current);
            prevPrev = prev;
            prev = current;
        }
        System.out.println();
        keyboard.close();
    }
}