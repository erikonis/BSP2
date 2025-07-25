package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please give the first integer number: ");
        int n = scan.nextInt();
        System.out.print("Please give the last integer number: ");
        int m = scan.nextInt();

        for (int i=n;i<=m;i++){
            System.out.println(i);
        }
        
        scan.close();
        
    }
}
