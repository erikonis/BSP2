import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int min = 0, max = 0, sum = 0, count = 0;

        System.out.println("Enter integers (0 to end):");
        number = in.nextInt();

        if (number != 0) {
            min = max = number;
            while (number != 0) {
                sum += number;
                count++;

                if (number < min) min = number;
                if (number > max) max = number;

                number = in.nextInt();
            }

            double avg = (double) sum / count;
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
            System.out.println("Average: " + avg);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
