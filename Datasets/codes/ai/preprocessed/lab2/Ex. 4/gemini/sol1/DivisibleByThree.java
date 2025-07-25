import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();

        int digit1 = number / 1000;
        int digit2 = (number % 1000) / 100;
        int digit3 = (number % 100) / 10;
        int digit4 = number % 10;

        int sum = digit1 + digit2 + digit3 + digit4;

        String result = (sum % 3 == 0) ? "Divisible by 3" : "Not divisible by 3";
        System.out.println(result);
    }
}