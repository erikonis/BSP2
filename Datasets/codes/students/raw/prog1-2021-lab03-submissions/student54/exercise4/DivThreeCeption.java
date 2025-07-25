package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        long nbr = scanner.nextInt();
        long displaynbr = nbr;
        long sum2, sum = sum2 = 0;
        while (nbr > 0) {
            sum = sum + nbr % 10;
            nbr = nbr / 10;
        }
        while (sum > 9) {
            sum2 += sum % 10;
            sum /= 10;
        }
        switch ((int) sum2) {
            case 3, 6, 9:
                System.out.println(displaynbr + " is divisible by 3");
                break;
            default:
                System.out.println(displaynbr + " is not divisible by 3");
                break;
        }
        scanner.close();
    }

}
