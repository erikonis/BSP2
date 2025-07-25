import java.util.Scanner;
public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0, count = 0;

        while ((num = scanner.nextInt()) != 0) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
            count++;
        }
        scanner.close();

        if (count > 0) {
            System.out.println("Smallest: " + min);
            System.out.println("Largest: " + max);
            System.out.println("Average: " + (double) sum / count);
        }
    }
}