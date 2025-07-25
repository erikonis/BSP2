import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter integers (0 to stop):");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) break;

            sum += input;
            count++;

            if (input < min) min = input;
            if (input > max) max = input;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
            System.out.println("Average: " + average);
        }
    }
}
