import java.util.Scanner;

public class DivThreeCeptionRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        long number = scanner.nextLong();

        long sum = sumDigits(number);
        while (sum >= 10) {
            sum = sumDigits(sum);
        }

        switch ((int) sum) {
            case 0:
            case 3:
            case 6:
            case 9:
                System.out.println("Divisible by 3");
                break;
            default:
                System.out.println("Not divisible by 3");
        }
    }

    public static long sumDigits(long number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumDigits(number / 10);
    }
}