package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter an integer: ");

                int number = scanner.nextInt();

        
        scanner.close();

        int numberCopy = number;
        int sum = 0;
        int digit = 0;
        int count = 0;
        
        while (number > 0)
                    {
                        digit = number % 10;
                        sum = sum + digit;
                        number = number / 10;
                    }
                System.out.println("Sum of digits Nr." + ++count + " = " + sum);


        while (sum > 9)
                {
                number = sum;
                sum = 0;
                while (number > 0)
                    {

                        digit = number % 10;
                        sum = sum + digit;
                        number = number / 10;
                    }
                System.out.println("Sum of digits Nr." + ++count + " = " + sum);
                }
        
        String is;
        
        switch (sum)
            {
                case 0 : 
                    is = "is";
                break;

                case 3 : 
                    is = "is";
                break;

                case 6 : 
                    is = "is";
                break;

                case 9 : 
                    is = "is";
                break;
                
                
                default :
                    is = "isn't";
                break;
            }
        
        System.out.println(sum + " " + is + " divisible by 3, and so " + numberCopy + " " + is + " divisible by 3.");
        
    }
    
}
