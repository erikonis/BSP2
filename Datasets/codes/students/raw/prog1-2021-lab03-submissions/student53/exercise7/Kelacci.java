package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kelacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1 || n == 2)
            System.out.println("K" + n + " is 1");
        else {
            int k1 = 1, k2 = 1, k3 = 1;
            for (int i = 3; i <= n; i++) {
                k3 = (k2 - 1) + (k1 * 2);
                k2 = k3;
                k1 = k2;
            }
            System.out.println("K" + n + " is " + k3);
        }
        scanner.close();
    }

}
