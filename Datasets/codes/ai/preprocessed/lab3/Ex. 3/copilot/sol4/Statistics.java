import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        System.out.println("Enter a sequence of integers (0 to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
            count++;
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average of all numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}