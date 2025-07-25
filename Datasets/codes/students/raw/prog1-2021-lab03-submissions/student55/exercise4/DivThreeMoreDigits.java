package lu.uni.programming1.lab3.exercise4;

import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x, digitSum, n;
        digitSum = 0;
        System.out.print("Please enter value: ");
        x = scanner.nextLong();

        while (x > 0) {System.out.println(x);
            
            n = x % 10;
            digitSum += n;
            x = x/ 10;
            
        }System.out.println("The sum of digits is: " + digitSum);
        scanner.close();
        boolean divisibleByThree = (digitSum %3 ==0)?true:false;
        System.out.println("The sum of digits is divisible by 3: " + divisibleByThree);
    }

}
