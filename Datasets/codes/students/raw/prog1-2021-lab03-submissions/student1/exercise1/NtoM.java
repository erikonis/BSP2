package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, m;
        System.out.println("Please enter the value n: ");
        n = scanner.nextInt();
        System.out.println("Please enter the value of m: ");
        m = scanner.nextInt();

        for(int i = n; i <= m; i++){
            System.out.print(i+ " ");
        }
       scanner.close();

        
    }
}
