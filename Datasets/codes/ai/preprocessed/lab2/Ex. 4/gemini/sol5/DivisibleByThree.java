import java.util.Arrays;
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number (at most 4 digits): ");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number);
        String result = (numberStr.length() > 4)
                ? "Error: Number has more than 4 digits."
                : checkDivisibility(numberStr);

        System.out.println(result);
        scanner.close();
    }

    public static String checkDivisibility(String numStr) {
        // Convert the String of digits to an array of integers
        int[] digits = Arrays.stream(numStr.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Calculate the sum of the digits using a loop on the array
        int sumOfDigits = 0;
        for (int digit : digits) {
            sumOfDigits += digit;
        }

        // Use the conditional operator for the result
        return (sumOfDigits % 3 == 0)
                ? "The number is divisible by three."
                : "The number is not divisible by three.";
    }
}