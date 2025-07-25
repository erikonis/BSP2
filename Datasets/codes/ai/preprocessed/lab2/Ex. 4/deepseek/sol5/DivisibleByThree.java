import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (up to 4 digits): ");
        int number = scanner.nextInt();

        // Calculate sum of digits
        int sum = (number / 1000) +          // thousands digit
                 ((number / 100) % 10) +     // hundreds digit
                 ((number / 10) % 10) +      // tens digit
                 (number % 10);              // units digit

        // Check divisibility using conditional operator
        String result = (sum % 3 == 0) ? "is divisible by 3" : "is not divisible by 3";

        System.out.println(number + " " + result);
    }
}