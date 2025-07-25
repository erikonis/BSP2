package exercise5;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double baseCost, int numberOfPavilions) {
        return baseCost;
    }
}