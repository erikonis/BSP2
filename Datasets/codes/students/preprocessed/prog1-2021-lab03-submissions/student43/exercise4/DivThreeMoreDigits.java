import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String args[]) {

        int  digit, sum = 0;
          Scanner console = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int ivalue  = console.nextInt();
        if(ivalue%3 == 0)
                System.out.println("The number " + ivalue + " is divisible by 3.");
        else
            System.out.println("The number " + ivalue + " is NOT divisible by 3.");
    
            while(ivalue > 0)
            {
                    digit = ivalue % 10;
                    sum = sum + digit;
                    ivalue = ivalue / 10;
            }
            System.out.println("Sum of Digits: "+sum);
        if(sum%3 == 0)
                    System.out.println("The sum " + sum + " is divisible by 3.");
            else
                    System.out.println("The sum " + sum + " is NOT divisible by 3.");
    
            
    }
    }  

