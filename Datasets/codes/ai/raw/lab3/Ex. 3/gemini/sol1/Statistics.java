package ex3;

import java.util.Scanner;

public class Statistics {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        do {
            System.out.print("Enter an integer (0 to stop): ");
            number = input.nextInt();

            if (number != 0) {
                sum += number;
                count++;
                smallest = Math.min(smallest, number);
                largest = Math.max(largest, number);
            }
        } while (number != 0);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}