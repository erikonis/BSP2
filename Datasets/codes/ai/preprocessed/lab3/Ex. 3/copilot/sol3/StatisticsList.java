public package exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StatisticsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) break;
            numbers.add(num);
        }

        if (!numbers.isEmpty()) {
            int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int num : numbers) {
                sum += num;
                if (num < min) min = num;
                if (num > max) max = num;
            }
            double average = (double) sum / numbers.size();
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
} {

}