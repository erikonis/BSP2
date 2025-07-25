import java.util.Scanner;

public class DivisibleByThreeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (up to 4 digits): ");
        int number = scanner.nextInt();

        int absNumber = Math.abs(number); // To support negative numbers
        int sum = 0;

        // Extract digits and sum them
        sum += absNumber % 10; absNumber /= 10;
        sum += absNumber % 10; absNumber /= 10;
        sum += absNumber % 10; absNumber /= 10;
        sum += absNumber % 10;

        String result = (sum % 3 == 0) ? "Divisible by 3" : "Not divisible by 3";
        System.out.println(result);
    }
}