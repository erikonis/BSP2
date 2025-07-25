import java.util.Scanner;
import java.util.stream.IntStream;

public class DivisibleByThree{

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
        // Use IntStream to process each digit character
        int sumOfDigits = IntStream.range(0, numStr.length())
                .map(numStr::charAt)
                .map(Character::getNumericValue)
                .sum();

        // Use the conditional operator for the result
        return (sumOfDigits % 3 == 0)
                ? "The number is divisible by three."
                : "The number is not divisible by three.";
    }
}