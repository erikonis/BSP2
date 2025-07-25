import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0, number, initial;
        

        System.out.println("Type your number here:");
        number = scanner.nextLong();
        initial = number;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }

        while (sum > 9) {
            number = sum;
            sum = 0;
            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }

        }
        switch((int)sum)
        {
            case 9:
            System.out.println("the number "+initial+" is divisible by 3!");
            break;
            case 6:
            System.out.println("the number "+initial+" is divisible by 3!");
            break;
            case 3:
            System.out.println("the number "+initial+" is divisible by 3!");
            break;

            default:
            System.out.println("the number "+initial+" is not divisible by 3!");
        }

        
        scanner.close();
    }

}
