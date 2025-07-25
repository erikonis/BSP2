package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, total;
        int sum = 0;
        boolean divisible = true;
        System.out.println("Please type a value: ");
        number = scanner.nextInt();
        total = number;
        while (number > 0 || number < 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        System.out.println("Sum of " + total + " is = " + sum);

        divisible = (sum % 3 == 0);
        System.out.println("Is " + total + "  divisible by 3: " + divisible);
        
        scanner.close();
    }
}
