package lu.uni.programming1.lab3.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> statistics = new ArrayList<>();

        System.out.println("Please enter integer number, if 0 is entered, the program will stop: ");

        int seq;

        do { 
            seq = scanner.nextInt();
            statistics.add(seq);
        } while (seq != 0);

        double sum = 0;
        
        for (int i = 0 ; i<statistics.size(); i++) {
             sum += statistics.get(i);
        }
        double average = sum / statistics.size();
        System.out.println("Average is: " + average);

        int maxvalue = Collections.max(statistics);
        System.out.println("Largest number of sequence is: " + maxvalue);
        int minvalue = Collections.min(statistics);
        System.out.println("Smallest number of sequence is: " + minvalue);

        scanner.close();
    }
}
