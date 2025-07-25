package exercise5;

public class GroupTicketDiscount implements DiscountStrategy {
    private int numberOfVisitors;

    public GroupTicketDiscount(int numberOfVisitors) {
        this.numberOfVisitors = numberOfVisitors;
    }

    @Override
    public double applyDiscount(double baseCost, int numberOfPavilions) {
        if (numberOfVisitors >= 6 && numberOfVisitors <= 12) {
            return baseCost * 0.7;
        } else if (numberOfVisitors > 12) {
            return baseCost * 0.6;
        }
        return baseCost;
    }
}