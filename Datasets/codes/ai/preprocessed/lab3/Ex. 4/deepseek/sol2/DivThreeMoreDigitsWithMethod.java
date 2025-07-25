import java.util.Scanner;

public class DivThreeMoreDigitsWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();

        long sum = sumDigits(number);
        boolean isDivisible = (sum % 3 == 0);
        System.out.println("The number " + number + " is " + (isDivisible ? "" : "not ") + "divisible by 3.");
    }

    public static long sumDigits(long number) {
        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}