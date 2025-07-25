import java.util.Scanner;

public class DivThreeCeption {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give a number: ");
        long startNumber = scanner.nextLong();

        scanner.close();

        long number = startNumber;
        long digitsSum = 10;

        while(digitsSum > 9){

            digitsSum = 0;

            while(startNumber > 0){
                digitsSum = digitsSum + startNumber % 10;
                startNumber = startNumber / 10;
            }

            if(digitsSum > startNumber){
                startNumber = digitsSum;
            }
        }

        switch((int)digitsSum){
            case 3:
            System.out.println(number + " is divisible by three.");
            break;
            case 6:
            System.out.println(number + " is divisible by three.");
            break;
            case 9:
            System.out.println(number + " is divisible by three.");
            break;
            default:
            System.out.println(number + " is not divisible by three.");
            break;
        }
    }
}
