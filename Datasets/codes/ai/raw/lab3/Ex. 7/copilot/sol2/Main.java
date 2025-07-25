package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n >= 1) System.out.print("K1 = 1");
        if (n >= 2) System.out.print(", K2 = 1");

        int k1 = 1, k2 = 1;
        for (int i = 3; i <= n; i++) {
            int kn = (k2 - 1) + (k1 * 2);
            System.out.print(", K" + i + " = " + kn);
            k1 = k2;
            k2 = kn;
        }
        System.out.println();
    }
}