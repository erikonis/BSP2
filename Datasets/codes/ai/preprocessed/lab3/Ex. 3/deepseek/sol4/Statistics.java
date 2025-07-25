import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of integers (0 to stop):");

        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number;

        do {
            number = scanner.nextInt();

            if (number != 0) {
                count++;
                sum += number;
                min = Math.min(min, number);
                max = Math.max(max, number);
            }
        } while (number != 0);

        double average = count > 0 ? (double) sum / count : 0;

        System.out.println("\nStatistics:");
        if (count > 0) {
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered (except 0)");
        }

        scanner.close();
    }
}