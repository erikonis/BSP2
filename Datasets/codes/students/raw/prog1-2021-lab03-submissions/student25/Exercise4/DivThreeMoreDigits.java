package lu.uni.programming1.lab3.Exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        long in = sc.nextLong(); 
        long org_in = in; 
        long sum = 0;
        sum =0;

        sc.close();
        while(in>0){ 
            sum+= in% 10;
            in/=10;
        }
        if(sum % 3==0){ 
            System.out.println(org_in+ " is divisible by 3");
        }
        else{
            System.out.println(org_in+ " is not divisible by 3");
        }
    }
}
    

