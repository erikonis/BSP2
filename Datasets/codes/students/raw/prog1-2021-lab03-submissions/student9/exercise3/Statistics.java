package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        int samll = 1000000000;
        int larg = -1000000000;
        double count = 0.0;
        while (number != 0) {
            System.out.print("Enter a number :");
            number = scanner.nextInt();
            if (number < samll) {
                samll = number;
            }
            if (number > larg) {
                larg = number;
            }

            sum += number;
            count++;
        }
        scanner.close();
        System.out.println(" The samallest number is " + samll);
        System.out.println("The largest number is " + larg);
        System.out.printf("The average of all number is %.2f", (double) sum / count);
    }
}
