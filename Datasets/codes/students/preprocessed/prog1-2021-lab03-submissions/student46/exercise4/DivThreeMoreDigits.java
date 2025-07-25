import java.util.Scanner;

public class DivThreeMoreDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter v: ");
        long v = scanner.nextLong();
        scanner.close();

        int s = 0;
        while (v > 0) {
            s += v % 10; // get last digit
            v = v / 10; // remove last digit from v
        }

        System.out.println("The sum of the digits is: " + s);

        if (s % 3 == 0) {
            System.out.println("Divisible by 3!");
        } else {
            System.out.println("Not divisible by 3!");
        }
    }
}