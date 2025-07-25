package exercise1;

import java.util.Scanner;

public class NtoMWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter m: ");
        int m = scanner.nextInt();

        printNumbers(n, m);
    }

    public static void printNumbers(int n, int m) {
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }
}