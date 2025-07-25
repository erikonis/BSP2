import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long integer: ");
        long number = scanner.nextLong();

        long sum = 0;
        long temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        boolean isDivisible = (sum % 3 == 0);
        System.out.println("The number " + number + " is " + (isDivisible ? "" : "not ") + "divisible by 3.");
    }
}