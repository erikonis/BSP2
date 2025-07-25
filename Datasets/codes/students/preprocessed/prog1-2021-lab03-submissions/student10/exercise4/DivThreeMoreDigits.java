import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number that you wish to know if it´s divisble by 3 :");

        long n=scanner.nextLong();

        scanner.close();
        
        long sum=0;

        while(n!=0){
            sum = sum + n%10;
            n= n/10;
        }
        System.out.println(sum);
        if(sum%3==0)
            System.out.println("It´s divisible by 3");
        else
            System.out.println("It´s not divisible by 3");
    }

}
