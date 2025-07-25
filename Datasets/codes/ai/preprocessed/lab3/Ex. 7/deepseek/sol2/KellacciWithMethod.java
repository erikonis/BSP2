public package exercise7;

import java.util.Scanner;

public class KellacciWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n must be at least 1.");
            return;
        }

        calculateKellacci(n);
    }

    public static void calculateKellacci(int n) {
        long k1 = 1, k2 = 1;
        System.out.println("K1: " + k1);
        if (n >= 2) {
            System.out.println("K2: " + k2);
        }

        for (int i = 3; i <= n; i++) {
            long kn = (k2 - 1) + (k1 * 2);
            System.out.println("K" + i + ": " + kn);
            k1 = k2;
            k2 = kn;
        }
    }
} {

}