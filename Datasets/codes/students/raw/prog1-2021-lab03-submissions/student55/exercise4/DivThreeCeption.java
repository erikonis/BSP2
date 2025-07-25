package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long x, digitSum, n;
        digitSum = 0;
        
        System.out.print("Please enter value: ");
        x = scanner.nextLong();
      
        
        do { digitSum=0; while (x!=0)
            
            {n = x % 10; //last digit
            digitSum += n;//adds last digit to current digit sum value
            x = x/ 10; //removing last digit
            System.out.println(x); //current number
        }
            System.out.println("The sum of digits is " + digitSum);
                    x=digitSum;//x stores digit sum so the loop can be run again
              
                }while (x/10!=0);
                    
              
                String isDivisibleByThree = "";
                    double sumOfDigits = (double) digitSum; 
                    sumOfDigits/=3;
                    System.out.println("Digit sum: " +sumOfDigits);             
                    int dS = (int) (sumOfDigits*10);
                    dS*=3;
                    System.out.println("Current number: "+dS);
                    
                    switch (dS) {
                        
                        case 30: isDivisibleByThree = "divisible by 3.";                                              
                        break;

                        case 60: isDivisibleByThree = "divisible by 3.";                         
                        break;

                        case 90: isDivisibleByThree = "divisible by 3.";
                        break;
                        
                        default: isDivisibleByThree = "not divisible by 3.";
                        break;
            }


            System.out.println("The number " +digitSum +" is "+isDivisibleByThree);
                    
            
            
                    

scanner.close();

}
}
