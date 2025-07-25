import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers (0 to finish):");
        
        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number;
        
        while ((number = scanner.nextInt()) != 0) {
            count++;
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\nResults:");
            System.out.println("Count: " + count);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No numbers entered.");
        }
        
        scanner.close();
    }
}