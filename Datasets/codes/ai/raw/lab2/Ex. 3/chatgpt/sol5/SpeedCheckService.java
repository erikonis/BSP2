public class SpeedCheckService {
    public static void evaluate(int typeId, int speed) {
        RoadType road = RoadType.fromId(typeId);

        if (road == null) {
            System.out.println("Unknown road type: " + typeId);
            return;
        }

        int speedLimit = road.getSpeedLimit();
        if (speed <= speedLimit) {
            System.out.println("Speed OK for " + road.getName() + " road.");
        } else {
            int excess = speed - speedLimit;
            int fine = FineCalculator.calculateFine(speedLimit, speed);
            System.out.println("Too fast for " + road.getName() + " road. " + excess + " over the limit!");
            System.out.println("Fine: " + fine + " EUR");
        }
    }
}
