import java.util.Scanner;

public class DivThreeCeption {
    
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you enter a number please : ");
        int number =scanner.nextInt();
        int coef = 1;
        int digit = 0;
        int sum = 0;
       
        do {
            do {
                digit = (number/coef)%10;
                coef = coef * 10;
                sum = digit + sum ;      
            } while (coef<=number);
            number=sum;
            coef=1;
            digit=0;
            sum=0;
        } while (10<=number);

        System.out.println("The sum for the digit is : " + number );

        switch (number){
            case 3 :
            System.out.println("Divisible by 3 !");
            break;
            case 6 :
            System.out.println("Divisible by 3 !");
            break;
            case 9 :
            System.out.println("Divisible by 3 !");
            break;
            default :
                System.out.println("Not divisible by 3 !");
        }
    
        scanner.close();
    }
}
