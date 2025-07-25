package lu.uni.programming1.lab3.exercise3;

import java.util.Scanner;

public class statistics {
    public static void main(String[] args) {
        int min, max, x, n = 0, s = 0;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        min = max = x;

        while (x != 0) {
            n++;
            s += x;
            if (x > max)
                max = x;
            if (x < min)
                min = x;
            x = scanner.nextInt();
        }

        System.out.println("The smallest number is " + min);
        System.out.println("The biggest number is " + max);
        System.out.println("The average is " + ((double) s / n));

        scanner.close();
    }

}
