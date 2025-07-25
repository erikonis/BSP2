package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); 
        System.out.println("Type the number:  ");
        int n = s.nextInt();  

        if (n<3) {if (n==1) {System.out.println("1 ");} else if (n==2) {System.out.println("1 1 ");} else {System.out.println(" undefined");}; }
        else  { 
            int[] a = new int [n]; a[0] = a[1] = 1;
            for (int i=2; i<n; i++) { a[i] =  ( (a[i-1]-1) + ((a[i-2])*2) );  };
            for (int j=0; j<n; j++) {System.out.print(" "+ a[j] + " ");};
        };
    }
}