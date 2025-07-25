public class FineCalculator {
    public static int calculateFine(int speed, int speedLimit) {
        int excess = speed - speedLimit;
        double excessPercentage = (excess * 100.0) / speedLimit;

        if (excessPercentage <= 5) {
            return 0;
        } else if (excessPercentage <= 30) {
            return 50;
        } else if (excessPercentage <= 50) {
            return 150;
        } else {
            return 500;
        }
    }
}