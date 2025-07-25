package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long digit = 0 ;

        System.out.print("the number =  ");
        long number = scanner.nextInt();
        long NForPrint = number;
        
       do{  
           digit = number % 10;
           sum = sum + digit;
           number = number / 10 ;

           if( number <1 && sum > 10 ){
            number = sum;
            sum = 0 ;
            digit = 0 ;
           }
           
 } while(number > 0 );

      switch ((int)sum){
   case 0:       
   case 3:
   case 6:
   case 9:
       System.out.println("the number " + NForPrint + " is divisible by 3." );
       break;
       default:
       System.out.println("the number " + NForPrint + " is not divisible by 3." );

      } 
 
           


     



scanner.close(); 
    }
    
}
