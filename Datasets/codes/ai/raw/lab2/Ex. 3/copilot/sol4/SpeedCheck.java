public class SpeedCheck {
    private static final String[] ROAD_TYPES = {"motorway", "ordinary", "town", "calmed"};
    private static final int[] SPEED_LIMITS = {130, 90, 50, 30};

    public static Road getRoadById(int typeId) {
        if (typeId < 1 || typeId > 4) {
            return null;
        }
        return new Road(ROAD_TYPES[typeId - 1], SPEED_LIMITS[typeId - 1]);
    }

    public static String checkSpeed(Road road, int speed) {
        int speedLimit = road.getSpeedLimit();
        if (speed <= speedLimit) {
            return "Speed OK for " + road.getType() + " road.";
        } else {
            int excess = speed - speedLimit;
            double excessPercentage = ((double) excess / speedLimit) * 100;
            int fine = calculateFine(excessPercentage);
            return "Too fast for " + road.getType() + " road. " + excess + " over the limit! Fine: " + fine + " Eur";
        }
    }

    private static int calculateFine(double excessPercentage) {
        if (excessPercentage > 5 && excessPercentage <= 30) {
            return 50;
        } else if (excessPercentage > 30 && excessPercentage <= 50) {
            return 150;
        } else if (excessPercentage > 50) {
            return 500;
        }
        return 0;
    }
}
