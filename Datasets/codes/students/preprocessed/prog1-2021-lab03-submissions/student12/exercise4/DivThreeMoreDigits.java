import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number,sum=0,initial;
        
        System.out.println("Type your number here:");
        number=scanner.nextLong();
        initial=number;
        while(number>0)
        {
            sum=sum+number%10;
            number=number/10;
        }
        if(sum%3==0)
        {
            System.out.println("Yes the number "+initial+" is divisible by 3!");
        }
        else
        {
            System.out.println("No the number "+initial+" is not divisible by 3!");
        }
        scanner.close();
        



    }
    
}
