package lu.uni.programming1.lab3.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Please type numbers to count: 0 stops the count: ");
        int num = scanner.nextInt();

        while (num != 0) {
            numbers.add(num);
            num = scanner.nextInt();
        }

        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
            sum = sum + numbers.get(i);
        }
        double average = sum / numbers.size();
        System.out.println("The smallest number: " + min);
        System.out.println("The biggest number: " + max);
        System.out.println("The average number: " + average);

        scanner.close();
    }
}
