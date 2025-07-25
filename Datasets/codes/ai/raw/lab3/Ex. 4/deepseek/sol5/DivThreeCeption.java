import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        long sum = Math.abs(number);
        
        do {
            long newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        } while (sum >= 10);
        
        boolean divisible;
        switch ((int)sum) {
            case 0: case 3: case 6: case 9:
                divisible = true;
                break;
            default:
                divisible = false;
        }
        
        System.out.println(number + " is " + (divisible ? "" : "not ") + "divisible by 3");
        scanner.close();
    }
}