import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int[] kellacci = new int[n];
        kellacci[0] = 1;
        if (n > 1) {
            kellacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            kellacci[i] = (kellacci[i - 1] - 1) + (kellacci[i - 2] * 2);
        }

        System.out.println("Kellacci sequence up to term " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(kellacci[i] + " ");
        }
    }
}
