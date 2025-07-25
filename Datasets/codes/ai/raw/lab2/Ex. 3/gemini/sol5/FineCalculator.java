public class FineCalculator {
    public static int calculateFine(double percentageExceeded) {
        if (percentageExceeded <= 5) {
            return 0;
        } else if (percentageExceeded <= 30) {
            return 50;
        } else if (percentageExceeded <= 50) {
            return 150;
        } else {
            return 500;
        }
    }
}