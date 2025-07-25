import java.util.Scanner;

// 1. DivThreeMoreDigits.java
public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number; // Handle negative numbers
        }

        long sumOfDigits = 0;
        long temp = number;

        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if (number == 0) {
            System.out.println(number + " is divisible by 3.");
        } else if (sumOfDigits % 3 == 0) {
            System.out.println(number + " is divisible by 3 (sum of digits: " + sumOfDigits + ").");
        } else {
            System.out.println(number + " is not divisible by 3 (sum of digits: " + sumOfDigits + ").");
        }

        scanner.close();
    }
}