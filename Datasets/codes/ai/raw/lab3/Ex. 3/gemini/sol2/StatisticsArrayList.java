package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class StatisticsArrayList {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        int number;
        ArrayList<Integer> numbers = new ArrayList<>();

        do {
            System.out.print("Enter an integer (0 to stop): ");
            number = input.nextInt();

            if (number != 0) {
                numbers.add(number);
            }
        } while (number != 0);

        if (!numbers.isEmpty()) {
            int smallest = numbers.get(0);
            int largest = numbers.get(0);
            int sum = 0;

            for (int num : numbers) {
                sum += num;
                smallest = Math.min(smallest, num);
                largest = Math.max(largest, num);
            }

            double average = (double) sum / numbers.size();
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}