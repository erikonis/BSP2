package lu.uni.programming1.lab3.exercise1;

import java.util.Scanner;
import java.lang.Math;

public class XtoY {
    
    public static void main(String[] args) {        
        double x, y, s, b; x = y = s = b = 0; int d = 3; boolean equal = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number: "); x = sc.nextDouble();
        System.out.println("Type the second number: "); y = sc.nextDouble();
        System.out.println("Type the number of steps (minimum 3): "); d = sc.nextInt();
        if (x==y) {equal = true;} else if (x<y) {s+=x; b+=y;} else {s+=y; b+=x;};
        sc.close(); if (equal == true || d<3) {if (equal) System.out.println("Both values are " + x + "Exiting... "); if (d<3 ){System.out.println();};System.exit(0);};
        double formula = (  (b-s)/d ); 
        for (int k=0; k<=d; k++) {
            if (k==0) {System.out.println("\n"+ (k+1) +" : " + s + " : the decimal value is " + (s-Math.floor(s)) + " ...(Note: The increment value is: " + formula + " )");}
            else{System.out.println("\n"+(k+1)+" : "+ (s+k*formula) +" : the decimal value is " + ((s+k*formula)-Math.floor(s+k*formula)) ); 
                if (k==d) System.out.println("( ...Note: The increment value is: " + formula + " )");};  }; }  }