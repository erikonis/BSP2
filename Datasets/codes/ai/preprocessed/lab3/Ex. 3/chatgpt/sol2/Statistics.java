import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) break;

            sum += num;
            count++;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        scanner.close();

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Smallest: " + min);
            System.out.println("Largest: " + max);
            System.out.println("Average: " + (double) sum / count);
        }
    }
}