import java.util.*;

public class Statistics {
    public static void main(String[]args) {
        int sum = 0;
        int counter = 0, input = 0, large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
        System.out.print("Enter a series of numbers (0 to quit): ");
        Scanner scanner = new Scanner(System.in);
        while ((input = scanner.nextInt()) != 0) {
            small = Integer.min(small, input);
            large = Integer.max(large, input);
            sum += input;
            counter++;
        }
            double average = sum / counter;
            System.out.println("The smallest integer is: " + small);
            System.out.println("The largest integer is: " + large);
            System.out.println("The average value is: " + average);
        scanner.close();
    }
}