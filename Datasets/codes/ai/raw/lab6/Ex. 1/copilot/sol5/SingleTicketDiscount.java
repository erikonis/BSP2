package exercise5;

public class SingleTicketDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double baseCost, int numberOfPavilions) {
        double totalCost = 0;
        for (int i = 0; i < numberOfPavilions; i++) {
            if (i < 3) {
                totalCost += baseCost / numberOfPavilions;
            } else {
                totalCost += (baseCost / numberOfPavilions) * 0.7;
            }
        }
        return totalCost;
    }
}