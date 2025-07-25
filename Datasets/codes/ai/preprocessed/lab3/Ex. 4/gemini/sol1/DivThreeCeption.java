import java.util.Scanner;

public class DivThreeCeption {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        long number = input.nextLong();

        long temp = number;
        do {
            long sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
        } while (temp >= 10);

        switch ((int) temp) {
            case 0:
            case 3:
            case 6:
            case 9:
                System.out.println(number + " is divisible by 3");
                break;
            default:
                System.out.println(number + " is not divisible by 3");
        }
    }
}