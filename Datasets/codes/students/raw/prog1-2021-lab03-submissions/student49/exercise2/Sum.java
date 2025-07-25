package lu.uni.programming1.lab3.exercise2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n:");
        int n = scanner.nextInt();
        while(!(n>1))
        {
            System.out.println("Please enter n:");
            n = scanner.nextInt();
        }

        int temp = 0;

        for(int i=1;i<=n;i++)
        {
            temp += i;
        }
        System.out.println(temp);

        temp = 0;
        int i = 1;
        while(i<=n)
        {
            temp +=i;
            i++;
        }
        System.out.println(temp);

        temp = 0;
        i = 1;
        do{
            temp +=i;
            i++;
        }
        while(i<=n);
        System.out.println(temp);

        System.out.println(String.valueOf((n*(n+1))/2));

        scanner.close();
    }
}
