package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;

public class DivThreeMoreDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = 0;
        long sum = 0;

        System.out.println("Please enter a number:");
        n = scanner.nextLong();

        while(n>0){
            long digit = n%10;
            n = n/10;
            sum+=digit;
        }

        if(sum%3 == 0){
            System.out.println("The number is divisible by 3.");
        }else{
            System.out.println("The number is not divisible by 3.");
        }

        scanner.close();
    }
    
}
