import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        int sum = 0;
        for (char digit : input.toCharArray()) {
            if (Character.isDigit(digit)) {
                sum += digit - '0';
            }
        }

        System.out.println("Sum of digits: " + sum);

        if (sum % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else {
            System.out.println("The number is NOT divisible by 3.");
        }
    }
}
