import java.util.Scanner;

public class DivisibilityByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number (up to 4 digits): ");
        int number = scanner.nextInt();

        // Calculate the sum of the digits
        int sumOfDigits = 0;
        int temp = number;
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Check if the sum of digits is divisible by 3
        String result = (sumOfDigits % 3 == 0) ? "The number is divisible by 3." : "The number is not divisible by 3.";
        System.out.println(result);
    }
}
