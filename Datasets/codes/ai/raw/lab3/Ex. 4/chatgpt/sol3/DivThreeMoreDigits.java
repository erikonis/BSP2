import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int digitSum = 0;
        long temp = number;

        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + digitSum);

        if (digitSum % 3 == 0) {
            System.out.println(number + " is divisible by 3.");
        } else {
            System.out.println(number + " is NOT divisible by 3.");
        }
    }
}
