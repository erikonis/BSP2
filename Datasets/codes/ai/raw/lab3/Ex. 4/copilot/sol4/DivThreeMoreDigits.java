import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long value:");
        long number = scanner.nextLong();

        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (sum % 3 == 0) {
            System.out.println("The sum of the digits is divisible by 3.");
        } else {
            System.out.println("The sum of the digits is not divisible by 3.");
        }
    }
}
