import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter road type id (1-4): ");
        int typeId = scanner.nextInt();

        System.out.print("Enter speed: ");
        int speed = scanner.nextInt();

        SpeedCheckService.evaluate(typeId, speed);
    }
}