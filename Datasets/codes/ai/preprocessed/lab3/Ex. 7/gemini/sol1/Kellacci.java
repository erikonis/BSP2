public package ex7;

import java.util.Scanner;

public class Kellacci {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }

        int k1 = 1;
        int k2 = 1;

        System.out.print(k1 + " " + k2 + " ");

        for (int i = 3; i <= n; i++) {
            int kn = (k2 - 1) + (k1 * 2);
            System.out.print(kn + " ");
            k1 = k2;
            k2 = kn;
        }
    }
} {

}