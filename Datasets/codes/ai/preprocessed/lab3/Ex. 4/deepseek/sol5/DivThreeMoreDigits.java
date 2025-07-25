import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long sum = 0;
        long temp = Math.abs(number);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        boolean divisible = (sum % 3 == 0);
        System.out.println(number + " is " + (divisible ? "" : "not ") + "divisible by 3");
        scanner.close();
    }
}