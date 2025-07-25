import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter number: ");
        long n= scanner.nextLong();

        int sum= 0;

        while(n > 0)
        {
            sum += n % 10;
            n /= 10;
            if(n < 1 && sum >= 10)
            {
                n= sum;
                sum= 0;
            }
        }
        
        switch (sum)
        {
            case 0, 3, 6, 9:
                System.out.println("Number is divisible by 3!");
            break;
            default:
                System.out.println("Number is not divisible by 3!");
            break;
        }

        scanner.close();
    }
}
