import java.util.Scanner;
import java.util.stream.IntStream;

public class DivisibleByThreeStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        scanner.close();

        int sum = number.chars().map(Character::getNumericValue).sum();
        System.out.println(sum % 3 == 0 ? "Divisible by 3" : "Not divisible by 3");
    }
}