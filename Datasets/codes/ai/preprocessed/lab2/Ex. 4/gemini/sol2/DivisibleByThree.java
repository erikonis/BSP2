import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number (at most 4 digits): ");
        int number = scanner.nextInt();

        // Ensure the number is within the assumed limit
        String numberStr = String.valueOf(number);
        String result = (numberStr.length() > 4)
                ? "Error: Number has more than 4 digits."
                : isDivisibleByThree(number);

        System.out.println(result);
        scanner.close();
    }

    public static String isDivisibleByThree(int num) {
        int sumOfDigits = 0;
        int temp = num;

        // Extract digits and calculate the sum
        sumOfDigits += temp % 10; // Get the last digit
        temp /= 10;              // Remove the last digit
        sumOfDigits += temp % 10;
        temp /= 10;
        sumOfDigits += temp % 10;
        temp /= 10;
        sumOfDigits += temp % 10;

        // Check divisibility by 3 using the modulo operator and the conditional operator
        return (sumOfDigits % 3 == 0)
                ? "The number is divisible by three."
                : "The number is not divisible by three.";
    }
}