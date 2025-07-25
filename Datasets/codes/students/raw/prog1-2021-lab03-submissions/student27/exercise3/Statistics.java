package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteries = 0, max = 0, min = 0, x = 0;
        double average = 0;
        boolean firstRun = true;
        System.out.print("Enter multiple numbers: ");
        do {
            average += x;
            max = Math.max(max, x);
            min = Math.min(min, x);
            enteries += 1;
            x = scanner.nextInt();
            if (firstRun) {
                min = x;
                firstRun = false;
            }

        } while (x != 0);

        System.out.format("The smallest number is %d\nThe largest number is %d\nThe average is %.2f\n", min, max,
                average / (enteries - 1));

        scanner.close();
    }
}
