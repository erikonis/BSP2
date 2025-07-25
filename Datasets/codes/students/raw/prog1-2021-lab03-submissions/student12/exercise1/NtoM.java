package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your first number:");
        n = scanner.nextInt();
        System.out.println("Please type your second number:");
        m = scanner.nextInt();
        if (n > m) {
            int help = n;
            n = m;
            m = help;
        }
        System.out.println("Counting from smaller digit to larger digit :");
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
        scanner.close();

    }

}
