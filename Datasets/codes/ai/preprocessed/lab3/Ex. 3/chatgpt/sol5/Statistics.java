import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            int num = in.nextInt();
            if (num == 0) break;

            sum += num;
            count++;

            if (num < min) min = num;
            if (num > max) max = num;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            printStats(min, max, sum, count);
        }
    }

    static void printStats(int min, int max, int sum, int count) {
        double avg = (double) sum / count;
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
        System.out.println("Average: " + avg);
    }
}