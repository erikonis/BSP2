import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        double sum = 0;
        int count = 0;

        System.out.println("Enter a sequence of integer numbers (enter 0 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume the invalid input
            }
            number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop when 0 is entered
            }

            smallest = Math.min(smallest, number);
            largest = Math.max(largest, number);
            sum += number;
            count++;
        }

        if (count > 0) {
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