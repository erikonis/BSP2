package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NToM {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for n:");
        n = scanner.nextInt();
        System.out.println("Please enter a number for m:");
        m = scanner.nextInt();
        n = Math.min(n, m);
        m = Math.max(n, m);

        for (int i = n; i < m; i++) {
            System.out.print(n);
            if (i != m) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
        scanner.close();
    }
}
