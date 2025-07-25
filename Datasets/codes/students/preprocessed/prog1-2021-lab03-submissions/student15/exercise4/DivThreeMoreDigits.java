import java.util.Scanner;

public class DivThreeMoreDigits {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter an integer: ");

                int number = scanner.nextInt();

        
        scanner.close();

        int numberCopy = number;
        int sum = 0;
        int digit = 0;

        while (number > 0)
            {
                digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }

        int verify = sum % 3;
        String is;

        if (verify == 0)
            {
                is = "is";
            }
        else 
            {
                is = "isn't";
            }

        System.out.println("The sum of digits = " + sum);
        System.out.println(sum + " " + is + " divisible by 3, and so " + numberCopy + " " + is + " divisible by 3.");
    }
    
}
