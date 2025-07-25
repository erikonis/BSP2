import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of your choice: ");

        long val = scanner.nextLong();

        int sum = 0;

        while (val != 0){
            long mod = val % 10;
            long div = val / 10;
            val = div;
            sum += mod;
        } 

        System.out.println("Sum of digits: " + sum);

        if (sum % 3 == 0 && sum != 0) {
            System.out.println("Divisible by 3 !");
        }
        else {
            System.out.println("Not divisible by 3 !");
        }

        scanner.close();
    }
}
