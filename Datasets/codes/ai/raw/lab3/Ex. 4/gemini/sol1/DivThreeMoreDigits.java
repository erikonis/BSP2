package lab03.Ex. 4.gemini.sol1;

public package ex4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        long number = input.nextLong();

        long temp = number;
        long sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (sum % 3 == 0) {
            System.out.println(number + " is divisible by 3");
        } else {
            System.out.println(number + " is not divisible by 3");
        }
    }
} {
    
}
