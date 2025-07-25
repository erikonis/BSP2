package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        int smallest, largest;
        double average, nbrOfNumbers = 1, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter numbers(0=stop):");
        sum=smallest = largest = scanner.nextInt(); //initialising smallest and largest

        while (scanner.hasNext()) {
            int tmp = scanner.nextInt();
            if (tmp == 0) {
                break;
            }
            if (largest < tmp) {
                largest = tmp;
            }
            if (smallest > tmp) {
                smallest = tmp;
            }
            nbrOfNumbers++;
            sum += tmp;
        }
        average = sum / nbrOfNumbers;
        System.out.println(" -smallest: " + smallest + "\n -largest: " + largest + "\n -average: " + average);
        scanner.close();
    }
}
