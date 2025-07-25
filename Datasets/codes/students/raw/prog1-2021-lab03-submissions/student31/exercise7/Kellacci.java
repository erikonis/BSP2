package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the n numbers of the Kellacci sequence, you want to know: ");
        int n = scanner.nextInt();
        int k = 1;
        int oldk = 1;

        for (int i = 1; i <= n; ++i) {
            if (i == 1) {
                System.out.println("K1 = 1");
            } else if (i == 2) {
                System.out.println("K2 = 1");
            } else {
                //old stores the value of k so oldk takes that value afterwards
                int old = k;
                k = (k - 1) + (oldk * 2);
                oldk = old;
                System.out.println("K" + i + " = " + k);
            }
        }

        scanner.close();
    }
}
