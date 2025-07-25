// File: exercise3/DivThreeMoreDigits.java
package exercise3;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        long number = scanner.nextLong();

        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Divisible by 3: " + (sum % 3 == 0));
    }
}