package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long number;
        number = 0;
        long sum;
        sum = 0;

        System.out.println("Please input your value");
        number = sc.nextLong();

        while (number > 0) {
            long value = number % 10;
            sum += value;
            number = number / 10;
        }

        if (sum % 3 == 0) {
            System.out.println("This number is divisible by 3 ");
        } else {
            System.out.println("This number isn`t divisible by 3 ");
        }

        sc.close();

    }
}
