import java.util.Scanner;

public class SpeedLimitCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read road type ID
        System.out.print("Enter road type ID (1: motorway, 2: ordinary, 3: town, 4: calmed): ");
        int roadTypeId = scanner.nextInt();

        // Read driver's speed
        System.out.print("Enter driver's speed: ");
        int speed = scanner.nextInt();

        // Check speed limit
        SpeedLimitChecker checker = new SpeedLimitChecker();
        checker.checkSpeedLimit(roadTypeId, speed);
    }
}