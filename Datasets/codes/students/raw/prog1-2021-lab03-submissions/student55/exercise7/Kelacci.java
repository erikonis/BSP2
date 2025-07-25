package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kelacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k1, k2, kn, n;
        k1 = 1;
        k2 = 1; //setting integer values
        kn = 0;
        System.out.print("Please enter value: ");
        n = scan.nextInt();

        for (int x = k1; x <= n; x++) {

            System.out.println("The value of k is: " + k1);
            kn = (k1 - 1) + (k2 * 2);
            k1 = k2;
            k2 = kn;

        }

        scan.close();
    }
}
