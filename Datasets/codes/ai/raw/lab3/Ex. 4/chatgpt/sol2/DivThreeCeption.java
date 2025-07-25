import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        scanner.close();

        int sum;
        do {
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        } while (sum >= 10);

        switch (sum) {
            case 3, 6, 9 -> System.out.println("Divisible by 3!");
            default -> System.out.println("Not divisible by 3!");
        }
    }
}
