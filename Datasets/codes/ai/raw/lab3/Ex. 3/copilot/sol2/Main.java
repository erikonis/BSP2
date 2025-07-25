// File: exercise3/Main.java
package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0) break;
            sum += num;
            count++;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Smallest number: " + min);
            System.out.println("Largest number: " + max);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}