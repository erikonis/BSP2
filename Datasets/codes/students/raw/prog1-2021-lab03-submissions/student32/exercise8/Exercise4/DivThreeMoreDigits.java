package lu.uni.programming1.lab3.exercise8.Exercise4;
import java.util.Scanner;
public class DivThreeMoreDigits {
    public static void main(String[] args){
        long number, sum = 0, result = 0, finalResult, ogValue;
        Scanner scan = new Scanner(System.in);
        number = scan.nextLong();
        ogValue = number;
        for (sum = 0; number!=0; number= number/10){
            sum = sum + number % 10;
        }
        System.out.println(sum);
        while (sum > 0){
            result = result + sum % 10;
            sum = sum / 10;
        }
        System.out.println(result);
        finalResult = result %3;
        if (finalResult == 0) {
            System.out.println(ogValue + " is divisible by 3");
        }
        else {
            System.out.println(ogValue + " is not divisible by 3");
        }
        scan.close();
    }
    
}
