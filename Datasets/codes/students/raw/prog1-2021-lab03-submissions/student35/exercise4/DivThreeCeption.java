package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);
        //setting condition for loops
        boolean condition = true;
        boolean condition2 = true; 
        //getting number
        System.out.println("Please enter a number");
        long number = scanner.nextLong();
        //initialize 
        long SUM = 0;
        //temp is needed to keep the number from the beginning
        long temp = number;
        //temp1 is needed afterwards to calculate the sum of the digits of the SUM
        long temp1 = 0;
        //Loop
        while(condition != false)
        {
            //get the last digit
            SUM= SUM + temp%10;
            //get rid of last digit
            temp = temp/10;
            if(temp <= 0)
            {
                condition = false;
            }
        }
        System.out.println("Sum: " + SUM);
        while(condition2 != false)
        {

            //get last digit
            temp1 = temp1 + SUM%10;
            //get rid of last digit
            SUM = SUM/10;
            if(SUM == 0)
            {
                if(temp1>9)
                {
                    SUM = temp1;
                    System.out.println("Sum: " + SUM);
                    temp1 = 0;
                }
                else
                {
                    SUM = temp1;
                    condition2 = false;
                }
            }
        }
        System.out.println("Sum: " + SUM);
        
        
        //is divisible by 3?
        // I converted SUM to an int because I know SUM is at this state only between 1 and 10
        switch((int)SUM){
            case 3,6,9 -> System.out.println("The number " + number + " is divisible by 3");
            //so default could be 1,2,4,5,7,8
            default -> System.out.println("The number " + number + " is not divisible by 3");
         };  



        //scanner close
        scanner.close();
        }
}
