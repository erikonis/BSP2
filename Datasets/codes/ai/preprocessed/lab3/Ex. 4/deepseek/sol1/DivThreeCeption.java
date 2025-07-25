public package exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();

        long sum = number;
        while (sum >= 10) {
            long temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        switch ((int) sum) {
            case 0:
            case 3:
            case 6:
            case 9:
                System.out.println("The number " + number + " is divisible by 3.");
                break;
            default:
                System.out.println("The number " + number + " is not divisible by 3.");
        }
    }
} {

}