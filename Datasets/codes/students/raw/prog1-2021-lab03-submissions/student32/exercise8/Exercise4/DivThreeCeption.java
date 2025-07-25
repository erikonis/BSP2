package lu.uni.programming1.lab3.exercise8.Exercise4;
import java.util.Scanner;
public class DivThreeCeption {
    public static void main(String[] args){
        long number, sum = 0, result = 0, ogValue = 0;
        int cases = 0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextLong();
        ogValue = number;
        for (sum = 0; number!=0; number= number/10){
            sum = sum + number % 10;
        }
        System.out.println(sum);
        while (sum > 10){
            result = result + sum % 10;
            sum = sum / 10;
        }
        System.out.println(result);
        cases = (int) (cases + result);
        switch (cases) {
            case 1: System.out.println("is not divisible");
                break;
            case 2: System.out.println("is not divisible");
                break;
            case 3: System.out.println("is divisible");
                break;
            case 4: System.out.println("is not divisible");
                break;
            case 5: System.out.println("is not divisible");
                break;
            case 6: System.out.println("is divisible");
                break;
            case 7: System.out.println("is not divisible");
                break;
            case 8: System.out.println("is not divisible");
                break;
            case 9: System.out.println("is divisible");
                break;
        }
        scan.close();
    }
}
