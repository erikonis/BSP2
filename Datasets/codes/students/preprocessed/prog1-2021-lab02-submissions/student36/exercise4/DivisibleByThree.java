import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = scanner.nextInt();
        int result = number%10;
        result += number/10%10;
        result += number/10/10%10;
        result += number/10/10/10%10;
        result = result%3;
        if(result == 0)
        {
            System.out.println("The number is divisible by three");
        }
        else
        {
            System.out.println("The number is not divisible by three");
        }
        

        scanner.close();
    }
}
