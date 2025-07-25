import java.util.Scanner;

public class DivisibilityByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number (up to 4 digits): ");
        int number = scanner.nextInt();

        // Calculate the sum of the digits using recursion
        int sumOfDigits = sumDigits(number);

        // Check if the sum of digits is divisible by 3
        String result = (sumOfDigits % 3 == 0) ? "The number is divisible by 3." : "The number is not divisible by 3.";
        System.out.println(result);
    }

    private static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumDigits(number / 10);
    }
}
