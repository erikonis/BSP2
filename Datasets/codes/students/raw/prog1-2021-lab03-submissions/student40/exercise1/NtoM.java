package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;

public class NtoM {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int m, n, big, small; m = n = big = small = 0; boolean equal = false;
        System.out.println("Type the first integer: "); m = scanner.nextInt();
        System.out.println("Type the second integer: "); n = scanner.nextInt();
        if (m<n) {big +=n; small+=m; } else if (m>n) {big+=m; small+=n;} else {equal = true; };
        scanner.close(); 
        if (equal) {System.out.print(m); System.exit(0);}
        else { for (int i=small; i<=big; i++) {System.out.print(i + " ");} };   } ; }