import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        long number = scanner.nextLong();

        long sum;
        do {
            sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        } while (sum >= 10);

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
}