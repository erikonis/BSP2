package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci {
    static int n, k, formula;
    public static void main(String[] args) {
        System.out.println("n = ?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        CalculateKellacci(n);
    }

    public static void CalculateKellacci(int n){
            for (k = 1; k < n; k++)
            formula = (k*(n-1)-1) + (k*(n-2)*2);

        System.out.println(formula);
    }
}
