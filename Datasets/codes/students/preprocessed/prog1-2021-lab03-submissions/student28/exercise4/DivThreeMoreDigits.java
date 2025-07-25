import java.util.Scanner;


public class DivThreeMoreDigits {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //variable to store the sum of the digits
        long sum = 0;
        long digit = 0;
        System.out.println("Enter a long number ");
        Scanner input = new Scanner(System.in);
        //variable to store the long number 
        long number = input.nextLong();
        //loop through the number to find the sum
        while(number > 0)
        {
            //extract the last number from the number    
            digit = number % 10;  
            //add the digit to the current sum  
            sum = sum + digit;  
            //remove the digit from the 
            number = number / 10;
        }  
        //now lets check whether the number is divisible by 3 
        if(sum % 3 == 0)
        {
            System.out.println("The number is divisible by 3");
        }
        else
        {
            System.out.println("The number is not divisible by 3");
        } 
    }
    
}
