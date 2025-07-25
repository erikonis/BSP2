import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a long value:");
        long number = scanner.nextLong();

        long sum = number;
        do {
            sum = sumDigits(sum);
        } while (sum >= 10);

        switch ((int) sum) {
            case 3:
            case 6:
            case 9:
                System.out.println("The sum of the digits is divisible by 3.");
                break;
            default:
                System.out.println("The sum of the digits is not divisible by 3.");
                break;
        }
    }

    private static long sumDigits(long number) {
        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
