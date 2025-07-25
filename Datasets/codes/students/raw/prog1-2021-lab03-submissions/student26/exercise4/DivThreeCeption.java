package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        long value = scanner.nextLong();
        long sum1 = 0;
        while (value > 0) {

            sum1 = sum1 + value % 10;

            value = value / 10;
        }
        long sum2 = sum1;
        while(sum2 >= 10){
            sum1 = sum2;
            sum2 = 0;
            while (sum1 > 0) {
                sum2 = sum2 + sum1 % 10;
                sum1 = sum1 / 10;
            }
        }

        switch ((int)sum2) {
            case 3,6,9:
                System.out.println("Divisible by 3!");
                break;
        
            default:
                System.out.println("Not divisible by 3!");
                break;
        }

        scanner.close();
    }
}
