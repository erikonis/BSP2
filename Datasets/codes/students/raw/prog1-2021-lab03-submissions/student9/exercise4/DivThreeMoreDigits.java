package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numberber   :");
        long number = scanner.nextInt();
        long sumOfDigits = 1000000000;
        while (sumOfDigits > 10) {
            sumOfDigits = 0;
            while (number != 0) {
                long latestDigits = number % 10;
                sumOfDigits += latestDigits;
                number = number - latestDigits;
                number = number / 10;
            }
            number = sumOfDigits;
            System.out.println(number);
        }
        if (sumOfDigits % 3 == 0) {
            System.out.print("divisible by 3");
        } else {
            System.out.print("not divisible by 3");
        }
        scanner.close();
    }
}