package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String args[]) {
        String ibreak = "N";
        int digit, lengthOfInt, sum = 0;
 // get the input from the console       
        Scanner console = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                int ivalue  = console.nextInt();
// Check input received is divisible by 3
            if(ivalue%3 == 0)
                    System.out.println("The number " + ivalue + " is divisible by 3.");
            else
                 System.out.println("The number " + ivalue + " is NOT divisible by 3.");
        ibreak = "N";
// Sum all the digits of the number recurrsively unit the sum is less than 10
            do
                {
                        digit = ivalue % 10;
                        sum = sum + digit;
                        ivalue = ivalue / 10;
                lengthOfInt = String.valueOf(sum).length();
 // go for next iteration to find the sum of the digits
                if (digit == 0 ){ 
                    if (lengthOfInt > 1){ 
                        ivalue = sum;
                        sum = 0;
                        digit = 0;
                        lengthOfInt = 0;}
                    if (lengthOfInt == 1){ibreak = "Y"; }
                    }
                System.out.println("Digit " + digit + " Sum " + sum + " Ivalue " + ivalue);
                }
        while(ibreak == "N"); // break when the sum of digits is less than 10
 // print the results       
         System.out.println("Sum of Digits: "+sum);
            if(sum%3 == 0)
                        System.out.println("The sum " + sum + " is divisible by 3.");
                else
                        System.out.println("The sum " + sum + " is NOT divisible by 3.");
        
}
}