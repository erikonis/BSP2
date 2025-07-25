package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int temp = 0;
        System.out.println("Please type a value: ");
        number = scanner.nextInt();
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Sum of value → " + sum);

        while (sum > 10) {

            while (sum > 0) {
                number = sum % 10;
                temp = temp + number;
                sum = sum / 10;
            }
            System.out.println("Sum of value → " + temp);
        }
        switch ((sum % 3) + (temp % 3)) {
        case 0:
            System.out.println("Is " + temp + "  divisible by 3: Yes");
            break;
        default:
            System.out.println("Is " + temp + "  divisible by 3: No");
            break;
        }

        scanner.close();
    }
}
