package lu.uni.programming1.lab3.exercise2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter am integer value for n: ");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.print("Please enter a positive integer value for n: ");
            n = scanner.nextInt();
        }

        int s1 = 0, s2 = 0, s3 = 0, s4 = 0, i;

        for (int i = 1; i <= n; i++) //sum by loop1
            s1 += i;

        i = 1; //sum by loop2
        while (i <= n) {
            s2 += i;
            i++;
        }

        i = 1;  //sum by loop3
        do {
            s3 += i;
            i++;
        } while (i <= n);

        s4 = n * (n + 1) / 2;   //sum by formula

        System.out.println("S1=" + s1 + " S2=" + s2 + " S3=" + s3 + " S4=" + s4);

        if (s1 == s2)
            if (s2 == s3)
                if (s3 == s4)
                    System.out.println("The sums are equal!");
        scanner.close();
    }

}
