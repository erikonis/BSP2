package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in); long sum=0; int nint = 0; boolean yn = true; 
        System.out.println("Type a number: "); long n = sc2.nextLong(); if (n<0) n*=-1; boolean ny2 = true;
        
        if (n>9) {

            do

            {
                
                while (n>9) {{sum+=n%10; System.out.println("adding " + sum + " and removing it from the tail... "); n/=10; ;}; }; 
                
                sum+=n; System.out.println("adding " + n);

                if (sum<=9) {ny2 = false; break; } 
                
                else {System.out.println(sum + " is bigger than 9; restarting the cycle... "); n=sum; sum=0;  }; 
               
            } while (ny2);


            nint = (int) sum; 
        }
             
        else nint = (int) n;

        switch(nint) {
            case 0,1,2,4,5,7,8: yn = false; }; 
        
        // the following line can be used to test whether nint is a number lower than 10, and whether the boolean yn works
        System.out.println("the final number is " + nint + ", " + yn);

        if (yn) {System.out.println("Yes, it is divisible by 3. ");}
        else {System.out.println("It is not divisible by 3. " );}; 

        sc2.close(); }   }