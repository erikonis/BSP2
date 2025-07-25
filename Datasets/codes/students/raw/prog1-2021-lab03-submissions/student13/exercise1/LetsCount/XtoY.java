package lu.uni.programming1.lab3.exercise1.LetsCount;

import java.util.Scanner;

public class XtoY {
    public static void main(String[] args) {
        int x;
        int y;
        double d;
        int tmp1;
        int tmp2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put the first number here: ");
        tmp1 = scanner.nextInt();
        System.out.println("Please put the second number here: ");
        tmp2 = scanner.nextInt();
        System.out.println("Please put the decimal number here: ");
        d = scanner.nextDouble();

        x = Math.min(tmp1, tmp2);
        y = Math.max(tmp1, tmp2);
        d = Math.abs(d);

       System.out.println("The numbers are: ");
       System.out.print(x);

        for(double i=x+d; i<=y;i += d)
        {
            System.out.print(", ");
            System.out.print(i);
        }
        System.out.print(".");
        scanner.close();
    }
}
