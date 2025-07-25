package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for N: ");
        int n = scanner.nextInt();

        System.out.println("Enter the number for M: ");
        int m = scanner.nextInt();

        int j;

        scanner.close();

        for (j = n; j <= m; j++)
            System.out.println(j);

    }
}
