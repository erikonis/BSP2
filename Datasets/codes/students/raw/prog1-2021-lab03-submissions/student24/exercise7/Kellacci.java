package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 'n' value :");
        int n = scanner.nextInt();
        if(n==1 || n==2){
            System.out.println("K(n) = 1");
        }
        else if(n<=0){
            System.out.println("n cannot be smaller than 1");
        }
        else{
            int kn2 = 1, kn1 = 1;
            int kn = 0;
            for (int i = 3; i <= n; i++) {
                kn = (kn1-1)+(kn2*2);
                kn2 = kn1;
                kn1 = kn;
            }
            System.out.println("K(n)= "+kn);
        }
        scanner.close();
    }
}
