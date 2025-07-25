public class SpeedChecker {
    public static void checkSpeed(RoadType roadType, int driverSpeed) {
        if (roadType == null) {
            System.out.println("Unknown road type.");
            return;
        }

        int speedLimit = roadType.getSpeedLimit();
        String roadTypeName = roadType.getName();

        if (driverSpeed <= speedLimit) {
            System.out.println("Speed OK for " + roadTypeName + " road.");
        } else {
            int excessSpeed = driverSpeed - speedLimit;
            System.out.println("Too fast for " + roadTypeName + " road. " + excessSpeed + " over the limit!");
            double percentageExceeded = (double) excessSpeed / speedLimit * 100;
            int fine = FineCalculator.calculateFine(percentageExceeded);
            System.out.println("Fine: " + fine + " Eur");
        }
    }
}