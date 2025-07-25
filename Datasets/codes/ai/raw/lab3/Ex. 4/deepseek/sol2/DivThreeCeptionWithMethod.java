package lab03.Others.deepseek;

public package exercise4;

import java.util.Scanner;

public class DivThreeCeptionWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();

        long sum = reduceToSingleDigit(number);
        switch ((int) sum) {
            case 0:
            case 3:
            case 6:
            case 9:
                System.out.println("The number " + number + " is divisible by 3.");
                break;
            default:
                System.out.println("The number " + number + " is not divisible by 3.");
        }
    }

    public static long reduceToSingleDigit(long number) {
        while (number >= 10) {
            number = sumDigits(number);
        }
        return number;
    }

    public static long sumDigits(long number) {
        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
} {
    
}
