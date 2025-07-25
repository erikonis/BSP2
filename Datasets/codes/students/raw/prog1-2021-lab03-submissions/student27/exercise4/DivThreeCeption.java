package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is divisible by 3: ");

        int number = scanner.nextInt();
        int numberToDivide = number;

        int sumOfNumbers = 0;

        while (numberToDivide > 0) {

            sumOfNumbers += numberToDivide % 10;
            numberToDivide = numberToDivide / 10;

            if (sumOfNumbers > 10) {
                sumOfNumbers = (sumOfNumbers % 10) + (sumOfNumbers / 10);
            }

        }

        switch (sumOfNumbers) {
        case 3, 6, 9:
            System.out.println(number + " is divisible by 3");
            break;

        default:
            System.out.println(number + " is not divisible by 3");
            break;
        }

        scanner.close();

    }
}
