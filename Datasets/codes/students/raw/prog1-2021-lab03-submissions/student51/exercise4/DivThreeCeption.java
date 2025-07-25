package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeCeption {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input of n
        System.out.println("Please enter the number:");
        long n = sc.nextLong();
        long temp = n;
        
        System.out.print(n);
        long sum = 0;
        long digit = 0;
        while(Math.abs(temp) > 0){
            digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        System.out.print(" -> sum of digits: " + sum);

        
        while(Math.abs(sum) > 10){
            while(Math.abs(sum) > 0){
                digit = sum % 10;
                temp += digit;
                sum = sum / 10;
            }
            System.out.print(" -> sum of digits: " + temp);
        }
        
        switch((int)sum % 3){
            case 0:
                System.out.print(" -> Divisible by 3!");
                break;
            default:
                System.out.println(" -> Not divisible by 3!");
        }

        sc.close();
    }
}
