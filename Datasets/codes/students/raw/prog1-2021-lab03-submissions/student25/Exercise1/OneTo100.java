package lu.uni.programming1.lab3.Exercise1;

import java.util.Scanner; 

public class OneTo100 {


    
    /**
     *
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);{
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            sc.close();  
            
        
            if (n>=1 && n<=100){
                System.out.println("Number : " + n );
            }  
            else {
                System.out.println("Invalid number");
                     }
                     
             }   
            } 
    }

