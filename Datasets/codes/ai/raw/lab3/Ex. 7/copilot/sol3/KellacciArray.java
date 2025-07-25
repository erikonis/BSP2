package exercise3;

import java.util.Scanner;

public class KellacciArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n >= 1) System.out.print("K1 = 1");
        if (n >= 2) System.out.print(", K2 = 1");

        int[] k = new int[n + 1];
        k[1] = 1;
        if (n >= 2) k[2] = 1;

        for (int i = 3; i <= n; i++) {
            k[i] = (k[i - 1] - 1) + (k[i - 2] * 2);
            System.out.print(", K" + i + " = " + k[i]);
        }
        System.out.println();
    }
}