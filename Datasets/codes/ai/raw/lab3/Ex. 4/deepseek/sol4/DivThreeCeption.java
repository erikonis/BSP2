import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        long sum = Math.abs(number); // Start with absolute value
        
        // Repeatedly sum digits until single digit remains
        do {
            sum = sumDigits(sum);
            System.out.println("Current sum: " + sum);
        } while (sum >= 10);
        
        // Check divisibility using switch
        boolean divisible;
        switch ((int)sum) {
            case 0: case 3: case 6: case 9:
                divisible = true;
                break;
            default:
                divisible = false;
        }
        
        System.out.println("Final single digit: " + sum);
        System.out.println(number + " is " + (divisible ? "" : "not ") + "divisible by 3");
        
        scanner.close();
    }
    
    private static long sumDigits(long num) {
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}