package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number, sum;
        System.out.print("Please enter an integer: ");
        number = scanner.nextLong();
        sum = 0;

        scanner.close();

        while (number >= 10) {
            sum += number%10;
            number /= 10;
            if (number < 10) {
                sum += number;
                System.out.println("Sum of digits: " + sum);
                if (sum > 9) {
                    number = sum;
                    sum = 0;
                }
            }
        }
        String check = (sum%3 == 0) ? "Sum is divisible by 3" : "Sum is not divisible by 3";
        System.out.println(check);
    }
}
