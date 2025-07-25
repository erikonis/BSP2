import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long finalDigit = getFinalDigitSum(Math.abs(number));

        // Check divisibility with switch
        switch ((int)finalDigit) {
            case 0: case 3: case 6: case 9:
                System.out.println(number + " is divisible by 3");
                break;
            default:
                System.out.println(number + " is not divisible by 3");
        }

        scanner.close();
    }

    private static long getFinalDigitSum(long num) {
        long sum;
        do {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        } while (sum >= 10);

        return sum;
    }
}