import java.util.Scanner;

public class DivThreeMoreDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer number: ");
        //if number negative gets converted to positive, works same way
        long number = Math.abs(scanner.nextLong());

        int sum = 0;


        while (number > 0) {
            sum += number % 10;
            number = (number - number % 10) / 10;
        }
        
        //is the number divisible by 3?
        if (sum % 3 == 0) {
            System.out.println("The number is divisible by three.");
        } else {
            System.out.println("The number is not divisible by three.");
        }

        scanner.close();
    }
}
