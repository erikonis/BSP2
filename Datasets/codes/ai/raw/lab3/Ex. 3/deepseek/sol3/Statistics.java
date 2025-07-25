import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sequence of integers (0 to stop):");
        
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while (true) {
            int number = scanner.nextInt();
            
            // Check for termination condition
            if (number == 0) {
                break;
            }
            
            // Update statistics
            count++;
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        
        // Calculate average (handle division by zero)
        double average = count > 0 ? (double) sum / count : 0;
        
        // Display results
        System.out.println("\nStatistics:");
        System.out.println("Smallest number: " + (count > 0 ? min : "N/A"));
        System.out.println("Largest number: " + (count > 0 ? max : "N/A"));
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}