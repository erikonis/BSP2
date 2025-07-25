import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (up to 4 digits): ");
        int number = scanner.nextInt();

        int sumOfDigits = 0;
        int temp = number;
        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        String result = (sumOfDigits % 3 == 0) ? "divisible by 3" : "not divisible by 3";
        System.out.println("The sum of digits is " + result);
    }
}