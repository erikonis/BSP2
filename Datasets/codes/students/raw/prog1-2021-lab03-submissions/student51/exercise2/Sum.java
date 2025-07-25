package lu.uni.programming1.lab3.exercise2;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Asks for positive input
        int n;
        do{
            System.out.println("Please enter a positive integer:");
            n = sc.nextInt();
        }
        while(n<0);

        // For-Loop
        int sumFor = 0;
        for(int i = 1; i <= n; i++){
            sumFor += i;
        }

        // While-Loop
        int j = 1;
        int sumWhile = 0;
        while(j < n+1){
            sumWhile += j;
            j++;
        }

        // Do-While-Loop
        int k = 1;
        int sumDo = 0;
        do{
            sumDo += k;
            k++;
        }
        while(k < n+1);

        // Calculates sum with formula and compares loops with it
        int sumFormula = (n*(n+1))/2;
        System.out.println("Sum: " + sumFormula);
        System.out.println("for-loop: -> " + (sumFor == sumFormula));
        System.out.println("while-loop: -> " + (sumWhile == sumFormula));
        System.out.println("do-while-loop: -> " + (sumDo == sumFormula));

        sc.close();
    }
}
