package lu.uni.programming1.lab3.exercise4;
import java.util.Scanner;

public class DivThreeCeption {
    static long findSum(long n){
        if(n<10)
        return n;
       
        long sum = 0;
        while(n>0){
            long digit = n%10;
            n = n/10;
            sum+=digit;
        }
        return findSum(sum);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = 0;

        System.out.println("Please enter a number:");
        n = scanner.nextLong();

        long result = findSum(n);
            
        switch ((int)result){
            case 3 : System.out.println("The number is divisible by 3.");
            break;
            case 6 : System.out.println("The number is divisible by 3.");
            break;
            case 9 : System.out.println("The number is divisible by 3.");
            break;
            default : System.out.println("The number is not divisible by 3.");
            break;
        }

        
        scanner.close();
    }
    
}
