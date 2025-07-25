import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int input;

        System.out.println("Enter a sequence of integer numbers (enter 0 to stop):");

        while (true) {
            System.out.print("Enter number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Consume invalid input
            }
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        if (!numbers.isEmpty()) {
            int smallest = Collections.min(numbers);
            int largest = Collections.max(numbers);
            double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered (excluding 0).");
        }

        scanner.close();
    }
}