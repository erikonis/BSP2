import java.util.Scanner;

// 2. DivThreeCeption.java
public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number; // Handle negative numbers
        }

        long currentSum = number;

        do {
            long sumOfDigits = 0;
            long temp = currentSum;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            currentSum = sumOfDigits;
        } while (currentSum >= 10);

        System.out.print(number + " -> sum of digits");
        long tempNumber = number;
        while (tempNumber >= 10) {
            long sum = 0;
            long temp = tempNumber;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            System.out.print(": " + sum);
            tempNumber = sum;
        }
        System.out.print(" -> " + currentSum + " -> ");

        switch ((int) currentSum) {
            case 0:
            case 3:
            case 6:
            case 9:
                System.out.println("Divisible by 3!");
                break;
            default:
                System.out.println("Not divisible by 3!");
                break;
        }

        scanner.close();
    }
}