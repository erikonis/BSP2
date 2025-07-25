package lu.uni.programming1.lab3.ex4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TO DO: put your code here
        System.out.print("Enter a number :");
        int num = scanner.nextInt();
        int sumOfDigits;
        scanner.close();
        do {
            sumOfDigits = 0;
            while (num != 0) {
                int currentLastDigit = num % 10;
                sumOfDigits += currentLastDigit;
                num = num - currentLastDigit;
                num = num / 10;
            }
            num = sumOfDigits;
            System.out.println("Sum of digits → " + num);
        } while (sumOfDigits >= 10);
        switch (sumOfDigits) {
        case 3, 6, 9:
            System.out.println("Number is divisble by 3 ");
            break;
        default:
            System.out.println("Number is not divisble by 3 ");
            break;
        }
    }
}
