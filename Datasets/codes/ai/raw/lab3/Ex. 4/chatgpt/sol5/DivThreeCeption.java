import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long number: ");
        long number = scanner.nextLong();

        int collapsed = recursiveDigitSum(number);
        System.out.println("Final single-digit sum: " + collapsed);

        switch (collapsed) {
            case 3, 6, 9:
                System.out.println("Divisible by 3!");
                break;
            default:
                System.out.println("Not divisible by 3.");
        }
    }

    static int recursiveDigitSum(long n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return (int)n;
    }
}
