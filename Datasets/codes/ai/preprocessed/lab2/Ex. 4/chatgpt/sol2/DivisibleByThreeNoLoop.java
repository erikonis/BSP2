import java.util.Scanner;

public class DivisibleByThreeNoLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (max 4 digits): ");
        int number = scanner.nextInt();
        scanner.close();

        int absNum = Math.abs(number);
        int sum = (absNum / 1000) + (absNum / 100 % 10) + (absNum / 10 % 10) + (absNum % 10);

        System.out.println(sum % 3 == 0 ? "Divisible by 3" : "Not divisible by 3");
    }
}