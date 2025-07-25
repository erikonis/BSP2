package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n= scanner.nextInt();

        System.out.print("Enter m: ");
        int m= scanner.nextInt();

        for(int p=n; p<=m; p++)
        {
            System.out.println(p);
        }
        
        scanner.close();
    } 
}
