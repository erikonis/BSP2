import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int result = recursiveDigitSum(number);

        System.out.println("Final single digit: " + result);

        switch (result) {
            case 3, 6, 9 -> System.out.println("Divisible by 3!");
            default -> System.out.println("Not divisible by 3.");
        }
    }

    static int recursiveDigitSum(long n) {
        int sum;
        do {
            sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        } while (sum >= 10);
        return sum;
    }
}
