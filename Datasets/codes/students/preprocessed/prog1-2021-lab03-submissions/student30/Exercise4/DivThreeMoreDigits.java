import java.util.Scanner;

public class DivThreeMoreDigits {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give a number: ");
        long startNumber = scanner.nextLong();

        scanner.close();

        long number = startNumber;
        long digitsSum = 0;

        while(startNumber > 0){
             digitsSum = digitsSum + startNumber % 10;
             startNumber = startNumber / 10;
        }

        if(digitsSum % 3 == 0){
            System.out.println(number + " is divisible by three.");
        }else{
            System.out.println(number + " is not divisible by three.");
        }
    }
}
