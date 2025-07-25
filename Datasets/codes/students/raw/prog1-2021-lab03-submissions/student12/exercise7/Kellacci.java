package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        int number, num3 = 0, num1 = 1, num2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your integer number n here:");
        number = scanner.nextInt();
        switch (number) {
        case 1:
            System.out.println(" K1 = 1");
            break;
        case 2:
            System.out.println(" K2 = 2");
            break;
        default:

            for (int i = 3; i <= number; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;

            }
            System.out.println("For the K" + number + " is the output: " + num3);

        }
        scanner.close();

    }
}
