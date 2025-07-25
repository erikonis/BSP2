import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (max 4 digits): ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0, temp = Math.abs(number);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(sum % 3 == 0 ? "Divisible by 3" : "Not divisible by 3");
    }
}
