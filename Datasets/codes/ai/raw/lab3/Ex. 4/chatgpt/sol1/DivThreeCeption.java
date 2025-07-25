// Exercise 4.2: DivThreeCeption.java
import java.util.Scanner;
public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        scanner.close();
        
        do {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        } while (num >= 10);
        
        switch ((int) num) {
            case 3: case 6: case 9:
                System.out.println("Divisible by 3");
                break;
            default:
                System.out.println("Not divisible by 3");
        }
    }
}