import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number (up to 4 digits): ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = 0;
        sum += number % 10;        // Units place
        sum += (number / 10) % 10; // Tens place
        sum += (number / 100) % 10; // Hundreds place
        sum += (number / 1000) % 10; // Thousands place

        // Check if the sum is divisible by 3
        boolean isDivisible = (sum % 3 == 0);

        // Output the result
        System.out.println("The number " + number + " is " + (isDivisible ? "" : "not ") + "divisible by 3.");
    }
}