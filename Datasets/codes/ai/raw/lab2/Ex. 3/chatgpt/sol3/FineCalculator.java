package SpeedCheckApp;

public class FineCalculator {
    public static int calculateFine(double percentExcess) {
        if (percentExcess <= 5) {
            return 0;
        } else if (percentExcess <= 30) {
            return 50;
        } else if (percentExcess <= 50) {
            return 150;
        } else {
            return 500;
        }
    }
}
