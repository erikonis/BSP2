package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    
    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        
        int K1 = 0;
        int K2 = 0;
        int K = 1;

        System.out.println("Can you give a n integer number ≥ 2 ? ");
            int n = scanner.nextInt();

        for (int i=2; i <=n; i++){
            K1=K2;
            K2=K; 
            K = K2+K1;
            System.out.println(K);
            
        }

        scanner.close();
    }

}
