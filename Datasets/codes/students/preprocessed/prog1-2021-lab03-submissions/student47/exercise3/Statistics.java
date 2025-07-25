import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Import numbers
        double n = 0;
        double sum = 0;
        double min = 99999999;
        double max = 0;

        // Loop

        while (true) {
            System.out.println("Can you give me a number ? : ");
            Double m = scanner.nextDouble();
            if (m == 0) {
                System.out.println("Sorry we stop because of zero.");
                System.out.println("Here the average " + sum / n + " and the smallest number " + min
                        + " and the largest number " + max);
                break;
            }
            sum = (sum + m);
            max = Math.max(m, max);
            min = Math.min(m, min);
            n++;

        }

        scanner.close();

    }
}