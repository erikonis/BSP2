import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer for n.");
            input.close();
            return;
        }

        int first = 1;
        int second = 1;

        System.out.print("Kellacci sequence up to K" + n + ": ");

        if (n >= 1) {
            System.out.print(first);
        }
        if (n >= 2) {
            System.out.print(", " + second);
        }

        for (int i = 3; i <= n; i++) {
            int next = (second - 1) + (first * 2);
            System.out.print(", " + next);
            first = second;
            second = next;
        }
        System.out.println();
        input.close();
    }
}