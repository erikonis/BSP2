import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of your choice: ");

        long val = scanner.nextLong();

        int sum = 0;

        do {
            long mod = val % 10;
            long div = val / 10;
            val = div;
            sum += mod;

            if (val == 0 && sum >= 10) {
                val = sum;
                System.out.println("Sum of digits: " + sum);
                sum = 0;
            }
        } while (val != 0);

        System.out.println("Sum of digits: " + sum);


        switch (sum) {
            case 0 : System.out.println("Not divisible by 3 !");
            break;
            case 1 : System.out.println("Not divisible by 3 !");
            break;
            case 2 : System.out.println("Not divisible by 3 !");
            break;
            case 3 : System.out.println("Divisible by 3 !");
            break;
            case 4 : System.out.println("Not divisible by 3 !");
            break;
            case 5 : System.out.println("Not divisible by 3 !");
            break;
            case 6 : System.out.println("Divisible by 3 !");
            break;
            case 7 : System.out.println("Not divisible by 3 !");
            break;
            case 8 : System.out.println("Not divisible by 3 !");
            break;
            case 9 : System.out.println("Divisible by 3 !");
            break;
        }

        scanner.close();
    }}

