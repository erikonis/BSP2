import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("n must be a positive integer.");
            scanner.close();
            return;
        }

        int k1 = 1;
        int k2 = 1;

        System.out.print("Kellacci sequence up to K" + n + ": ");
        if (n >= 1) {
            System.out.print(k1);
        }
        if (n >= 2) {
            System.out.print(", " + k2);
        }

        for (int i = 3; i <= n; i++) {
            int kn = (k2 - 1) + (k1 * 2);
            System.out.print(", " + kn);
            k1 = k2;
            k2 = kn;
        }
        System.out.println();
        scanner.close();
    }
}