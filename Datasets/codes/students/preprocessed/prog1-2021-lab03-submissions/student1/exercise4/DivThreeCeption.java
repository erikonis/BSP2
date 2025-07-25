import java.util.Scanner;

public class DivThreeCeption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0, digit;

        System.out.println("Type a long number: ");
        num = scanner.nextInt();

        while (num > 0) {
            digit = (num % 10);
            sum += digit;
            num = num / 10;

            if (num == 0 && sum > 9) {
                System.out.println("\nSum of a long number's digits: " + sum);
                num = sum;
                sum = 0;
            }

        }
        System.out.println("Sum of the remainder number's digits: " + sum);
        switch (sum) {
        case 3, 6, 9:
            System.out.println("\nThe number "+sum+" is divisible by 3!");
            break;
        default:
            System.out.println("\nThe number "+sum+" is not divisible by 3!");
            break;
        }

        scanner.close();

    }
}