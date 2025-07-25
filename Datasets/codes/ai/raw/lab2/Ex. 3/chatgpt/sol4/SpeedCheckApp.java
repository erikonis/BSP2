import java.util.Scanner;

public class SpeedCheckApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter road type id: ");
        int typeId = scanner.nextInt();
        System.out.print("Enter your speed: ");
        int speed = scanner.nextInt();

        RoadType road = RoadType.getById(typeId);
        if (road == null) {
            System.out.println("Unknown road type: " + typeId);
            return;
        }

        int limit = road.getSpeedLimit();
        if (speed <= limit) {
            System.out.println("Speed OK for " + road.getName() + " road.");
        } else {
            int excess = speed - limit;
            int fine = FineCalculator.calculateFine(speed, limit);
            System.out.println("Too fast for " + road.getName() + " road. " + excess + " over the limit!");
            System.out.println("Fine: " + fine + " EUR");
        }
    }
}