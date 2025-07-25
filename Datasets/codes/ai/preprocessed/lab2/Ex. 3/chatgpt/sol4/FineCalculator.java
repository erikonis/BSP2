public class FineCalculator {
    public static int calculateFine(int speed, int limit) {
        if (speed <= limit) return 0;
        double excessPercent = ((double)(speed - limit) / limit) * 100;
        if (excessPercent <= 5) return 0;
        else if (excessPercent <= 30) return 50;
        else if (excessPercent <= 50) return 150;
        else return 500;
    }
}