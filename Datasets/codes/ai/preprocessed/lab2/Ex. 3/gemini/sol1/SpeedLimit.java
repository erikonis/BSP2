import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter road type ID: ");
        int roadType = scanner.nextInt();
        System.out.print("Enter driver's speed: ");
        int speed = scanner.nextInt();

        int speedLimit = 0;
        String roadName = "";

        switch (roadType) {
            case 1: speedLimit = 130; roadName = "motorway"; break;
            case 2: speedLimit = 90; roadName = "ordinary"; break;
            case 3: speedLimit = 50; roadName = "town"; break;
            case 4: speedLimit = 30; roadName = "calmed"; break;
            default: System.out.println("Unknown road type: " + roadType); return;
        }

        if (speed <= speedLimit) {
            System.out.println("Speed OK for " + roadName + " road.");
        } else {
            int excess = speed - speedLimit;
            System.out.println("Too fast for " + roadName + " road. " + excess + " over the limit!");
        }
    }
}