package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter v: ");
        long v = scanner.nextLong();
        scanner.close();

        int s; // the sum of the digits of a long value will fit into an int

        System.out.print(v);

        do {
            s = 0;
            while (v > 0) {
                s += v % 10; // get last digit
                v = v / 10; // remove last digit from v
            }
            v = s; // our sum is the new v
            System.out.print(" -> " + s); // prints the progression on the same line
        } while (s > 9);
        System.out.println(); // goes to a new line

        System.out.println("The sum of the digits is: " + s);

        switch (s) {
        case 0, 3, 6, 9:
            System.out.println("Divisible by 3!");
            break;
        default:
            System.out.println("Not divisible by 3!");
            break;
        }
    }
}