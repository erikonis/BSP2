package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long n1 = n;
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n = n / 10;
        }

        if (s % 3 == 0)
            System.out.println(n1 + " is divisible by 3.");
        else
            System.out.println(n1 + " isn't divisible by 3.");

        scanner.close();

    }

}