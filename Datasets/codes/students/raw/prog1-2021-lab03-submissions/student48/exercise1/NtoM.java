package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int m = input.nextInt();

        int min = Math.min(m,n);
        int max = Math.max(m,n);

        for (; min <= max; min++) {
            System.out.println(min);
        }
        input.close();
    }
}
