package lu.uni.programming1.lab3.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int sum = 0;
        int min = 0;
        int max = 0;

        System.out.println("Enter number:");

        while (true) {
            System.out.print("> ");
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        min = numbers.get(0);
        max = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);

            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }
        }
        System.out.println(numbers);

        double avg = (double)sum / numbers.size();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);

        input.close();
    }
}
