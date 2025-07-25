import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number (up to 4 digits): ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = DigitSumCalculator.calculateSum(number);

        // Check if the sum is divisible by 3
        boolean isDivisible = (sum % 3 == 0);

        // Output the result
        System.out.println("The number " + number + " is " + (isDivisible ? "" : "not ") + "divisible by 3.");
    }
}