package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
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
    int divisibleby3 = sum0 % 3;
    if (divisibleby3 == 0)
        System.out.println("Divisible by 3!");
    if (divisibleby3 != 0)
        System.out.println("Not divisible by 3!");
    scanner.close();
    }
}
