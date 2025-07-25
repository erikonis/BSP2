package lu.uni.programming1.lab3.ex4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TO DO: put your code here
        System.out.print("Enter a number :");
        int num = scanner.nextInt();
        int sumOfDigits = 100000;
        while (sumOfDigits > 10) {
            sumOfDigits = 0;
            while (num != 0) {
                int currentLastDigit = num % 10; // Get las digit
                sumOfDigits += currentLastDigit;
                num = num - currentLastDigit;
                num = num / 10; // removes last digit from num
            }
            num = sumOfDigits;
            System.out.println(num);
        }
        if (sumOfDigits % 3 == 0) {
            System.out.print("The number is divisible by three");
        } else {
            System.out.print("The number is not divisible by three");
        }
        scanner.close();
    }
}
