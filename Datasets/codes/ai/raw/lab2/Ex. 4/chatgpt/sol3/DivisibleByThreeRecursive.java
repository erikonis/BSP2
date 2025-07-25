import java.util.Scanner;

public class DivisibleByThreeRecursive {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return Math.abs(n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = sumDigits(number);
        System.out.println(sum % 3 == 0 ? "Divisible by 3" : "Not divisible by 3");
    }
}
