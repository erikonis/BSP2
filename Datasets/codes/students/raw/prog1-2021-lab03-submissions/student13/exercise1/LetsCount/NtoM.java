package lu.uni.programming1.lab3.exercise1.LetsCount;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        
            int n;
            int m;
            int tmp1;
            int tmp2;
            Scanner scanner = new Scanner(System.in);

        System.out.println("Please put the first number here: ");
        tmp1 = scanner.nextInt();
        System.out.println("Please put the second number here: ");
        tmp2 = scanner.nextInt();

        n = Math.min(tmp1, tmp2);
        m = Math.max(tmp1, tmp2);

        System.out.println("The numbers are: ");
        for(int i=n; i<=m;i++)
        {
            System.out.print(i);

            if(i==m)
            {
                System.out.print(".");
            }
            else
            {
                System.out.print(", ");
            }
        }
        scanner.close();
    }
}
