import java.util.Arrays;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100]; // Assuming a maximum of 100 numbers for simplicity
        int count = 0;
        int input;

        System.out.println("Enter a sequence of integer numbers (enter 0 to stop):");

        while (count < numbers.length) {
            System.out.print("Enter number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers[count++] = input;
        }

        if (count > 0) {
            int smallest = numbers[0];
            int largest = numbers[0];
            double sum = 0;

            for (int i = 0; i < count; i++) {
                smallest = Math.min(smallest, numbers[i]);
                largest = Math.max(largest, numbers[i]);
                sum += numbers[i];
            }

            double average = sum / count;
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered (excluding 0).");
        }

        scanner.close();
    }
}