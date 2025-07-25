package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("value of N: ");
        int n = scanner.nextInt();
        System.out.println("value of M: " );
        int m = scanner.nextInt();
        System.out.println("");

        if(n>m){
            int temp=n;
            n=m;
            m=temp;
        }

        for(int i=n;i<=m;i++)
        System.out.println(i);
        scanner.close();
    }
}
