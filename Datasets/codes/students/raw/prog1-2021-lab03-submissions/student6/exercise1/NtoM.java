package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type N number: ");
        int n = scanner.nextInt();
        System.out.println("Please type M number:");
        int m = scanner.nextInt();
        for (int i = n; i <= m; i++) {
            System.out.println("Step: " + i);
        }

        scanner.close();
    }
}
