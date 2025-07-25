public class GroupTicket extends Ticket {
    private int numberOfVisitors;

    public GroupTicket(Pavilion[] pavilions, int numberOfVisitors) {
        super(pavilions);
        this.numberOfVisitors = numberOfVisitors;
    }

    @Override
    public double calculateCost() {
        double baseCost = super.calculateCost();
        if (numberOfVisitors >= 6 && numberOfVisitors <= 12) {
            return baseCost * 0.7; // 30% discount
        } else if (numberOfVisitors > 12) {
            return baseCost * 0.6; // 40% discount
        } else {
            return baseCost;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("Total Cost: " + super.calculateCost() + " EUR", "Total Cost: " + calculateCost() + " EUR\nNumber of Visitors: " + numberOfVisitors);
    }
}