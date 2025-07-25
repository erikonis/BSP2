import java.util.Scanner;

public class DivThreeCeption {
    static long findaSum(long number) {
        if (number < 10)
            return number;

        long sum = 0;
        while (number > 0) {
            long value = number % 10;
            sum += value;
            number = number / 10;
        }
        return findaSum(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = 0;

        System.out.println("Please enter a number: ");
        number = sc.nextLong();

        long value = findaSum(number);

        switch ((int) value) {
        case 3:
            System.out.println("This number is divisible by 3 ");
        case 6:
            System.out.println("This number is divisible by 3 ");
        case 9:
            System.out.println("This number is divisible by 3 ");
            break;
        default:
            System.out.println("The number isn`t divisible by 3 ");
            break;
        }

        sc.close();
    }

}
