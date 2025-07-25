package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class MtoN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Start number...");
        int m = scan.nextInt();

        System.out.println("..End number");
        int n = scan.nextInt();

        for (m = m; m<=n; ++m){
            System.out.println(m);
        }

        scan.close();
    }
    
}
