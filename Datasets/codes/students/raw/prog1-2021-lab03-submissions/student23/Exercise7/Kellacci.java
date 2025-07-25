package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Intput desired rank of Kellacci sequence :");
        int n = scan.nextInt();

        if (n>2){
            int k1 = 1; int k2 = 1;
            int kn = 0;

            for (int i = 2; i<= n; ++i){
                kn = k2 - 1  + k1 * 2;

                k2 = k1;
                k1 = kn;

                System.out.println(kn);
            }
        }

        scan.close();

       

    }
    
}
