public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double baseCost, int numberOfPavilions) {
        return baseCost;
    }
}