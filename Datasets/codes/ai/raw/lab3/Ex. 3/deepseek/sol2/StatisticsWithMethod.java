package exercise3;

import java.util.Scanner;

public class StatisticsWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter a sequence of integers (enter 0 to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            count++;
            sum += number;
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = calculateAverage(sum, count);
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        }
    }

    public static double calculateAverage(int sum, int count) {
        return (double) sum / count;
    }
}