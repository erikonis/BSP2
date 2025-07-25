package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, i, small, large;
        System.out.println("Enter a number: ");
        n = scan.nextInt();
        small = n;
        large = n;
        double somme = n;
        i = 1;

        while (n != 0) {
            n = scan.nextInt();
            if (n != 0) {
                small = Math.min(n, small);
                large = Math.max(n, large);
                somme += n;
                ++i;
            }

        }

        double average = somme / i;

        if (n == 0) {
            System.out.println("Smallest number: " + small);
            System.out.println("Largest number: " + large);
            System.out.println("The average is : " + average);
        }

        scan.close();

    }
}
