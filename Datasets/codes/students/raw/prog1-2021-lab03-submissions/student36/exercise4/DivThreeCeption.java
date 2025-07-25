package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        int digit, sum0 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = scanner.nextLong();
        System.out.println("Number: " + number);
        while (number > 0) {
            digit = (int) (number % 10);
            sum0 = sum0 + digit;
            number = number / 10;
        }
        System.out.println("Sum of digits: " + sum0);
        int sum1 = 0;
        while (sum0 > 0) {
            digit = (sum0 % 10);
            sum1 = sum1 + digit;
            sum0 = sum0 / 10;
        }
        System.out.println("Sum of digits: " + sum1);
        int sum2 = 0;
        while (sum1 > 0) {
            digit = (sum1 % 10);
            sum2 = sum2 + digit;
            sum1 = sum1 / 10;
        }
        System.out.println("Sum of digits: " + sum2);
        switch (sum2 % 3) {
            case 0:
            System.out.println("Divisible by 3!");
            break;
            default:
            System.out.println("Not divisible by 3!");
        }
        scanner.close();
    }
}
