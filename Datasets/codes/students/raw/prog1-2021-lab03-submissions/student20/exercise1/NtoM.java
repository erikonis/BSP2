package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;
public class NtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter n :");
        Integer n = scanner.nextInt();
        System.out.println("Please enter m (which is greater than n) :");
        Integer m = n-1;
        while(m<n){
            m = scanner.nextInt();
        }
        System.out.println("Integers between "+ n +" and "+ m);
        --n;
        while(n < m){
            n ++;
            System.out.println(n);
        } 
    scanner.close();
    }
}
