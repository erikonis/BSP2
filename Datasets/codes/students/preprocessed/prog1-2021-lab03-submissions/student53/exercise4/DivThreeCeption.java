import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long n1 = n;
        long s = n;
        while (s >= 10) {
            n = s;
            s = 0;
            while (n != 0) {
                s += n % 10;
                n = n / 10;
            }
        }

        int s2 = (int) s;
        switch (s2) {
        case 3:
            System.out.println(n1 + " is divisible by 3.");
            break;
        case 6:
            System.out.println(n1 + " is divisible by 3.");
            break;
        case 9:
            System.out.println(n1 + " is divisible by 3.");
            break;
        default:
            System.out.println(n1 + " is not divisible by 3.");

        }

        scanner.close();

    }

}
