package lu.uni.programming1.lab3.Exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        int min = 100000000;
        int max = -100000000;
        double count = 0.0;
        while (num != 0) {
            System.out.print("Enter a number :");
            num = scanner.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
            count++;
        }
        scanner.close();
        System.out.println(" The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The average is %.2f", (double) sum / count);
    }
}
