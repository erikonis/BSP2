import java.util.Scanner;
public class DivThreeMoreDigits {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);
        //setting condition fot loop
        boolean condition = true;
        //getting number
        System.out.println("Please enter a number");
        long number = scanner.nextLong();
        //initialize 
        long sum = 0;
        //temp is needed to keep the number from the beginning
        long temp = number;
        //Loop
        while(condition != false)
        {
            //get the last digit
            sum = sum + temp%10;
            //get rid of last digit
            temp = temp/10;
            if(temp <= 0)
            {
                condition = false;
            }
        }
        //  System.out.println("Sum: " + sum);
        //is divisible by 3?
        if(sum%3 == 0)
        {
            System.out.println("The number " + number + " is divisible by 3");
        }
        else
        {
            System.out.println("The number " + number + " is not divisible by 3");
        }



        //scanner close
        scanner.close();
        
    }
}
