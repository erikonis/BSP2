import java.util.Scanner;

public class DivisibleByThreeAlternative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number (at most 4 digits): ");
        int number = scanner.nextInt();

        String result = (String.valueOf(number).length() > 4)
                ? "Error: Number has more than 4 digits."
                : checkDivisibility(number);

        System.out.println(result);
        scanner.close();
    }

    public static String checkDivisibility(int num) {
        int sum = 0;
        String numStr = String.valueOf(num);

        // Iterate through the digits of the number (as a String)
        for (int i = 0; i < numStr.length(); i++) {
            // Convert each digit character back to an integer and add to the sum
            sum += Character.getNumericValue(numStr.charAt(i));
        }

        // Use the conditional operator to return the result
        return (sum % 3 == 0)
                ? "The number is divisible by three."
                : "The number is not divisible by three.";
    }
}