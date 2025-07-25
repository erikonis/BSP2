import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int sumOfDigits;
        scanner.close();
        do {
            sumOfDigits = 0;
            while (number != 0) {
                int lastDigits = number % 10;
                sumOfDigits += lastDigits;
                number = number - lastDigits;
                number = number / 10;
            }
            number = sumOfDigits;
            System.out.println(number);
        } while (sumOfDigits >= 10);
        switch (sumOfDigits) {
        case 3, 6, 9:
            System.out.println("divisble by 3 ");
            break;
        default:
            System.out.println("not divisble by 3 ");
            break;

        }
    }

}
