package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, k1=1, k2=1, k, i;

        System.out.print("Enter a integer number: ");
        n = scan.nextInt();

        scan.close();

        System.out.println("The Kellacci sequence K is: ");

        for(i = 1; i <= n; i++){

            if (i <=2){
                System.out.println(1);    
            }
            else {
                k=(k1 - 1) + (k2 * 2);
                k2=k1;
                k1=k;

                System.out.println(k);
            }

        }
        
    }
}
