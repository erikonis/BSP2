import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long number: ");
        long num = scanner.nextLong();

        long original = num;
        int[] digits = new int[20]; // supports up to 20 digits
        int index = 0;
        int sum = 0;

        while (num > 0) {
            digits[index++] = (int)(num % 10);
            sum += digits[index - 1];
            num /= 10;
        }

        System.out.print("Digits: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nSum of digits: " + sum);

        System.out.println((sum % 3 == 0) ? "Divisible by 3." : "Not divisible by 3.");
    }
}
